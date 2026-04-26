@GrpcService
public class MovieGrpcService extends MovieServiceGrpc.MovieServiceImplBase {

    private final CreateMovieHandler createMovieHandler;
    private final GetMovieHandler getMovieHandler;
    private final DeleteMovieHandler deleteMovieHandler;
    private final MovieRepository movieRepository;

    public MovieGrpcService(
            CreateMovieHandler createMovieHandler,
            GetMovieHandler getMovieHandler,
            DeleteMovieHandler deleteMovieHandler,
            MovieRepository movieRepository
    ) {
        this.createMovieHandler = createMovieHandler;
        this.getMovieHandler = getMovieHandler;
        this.deleteMovieHandler = deleteMovieHandler;
        this.movieRepository = movieRepository;
    }

    // =======================
    // CREATE MOVIE
    // =======================
    @Override
    public void createMovie(CreateMovieRequest request,
                            StreamObserver<MovieDto> responseObserver) {

        var command = new CreateMovieCommand(
                request.getTitle(),
                request.getGenre(),
                request.getRating(),
                request.getDescription()
        );

        Movie movie = createMovieHandler.handle(command);

        MovieDto response = MovieDto.newBuilder()
                .setMovieId(movie.getId())
                .setTitle(movie.getTitle().value())
                .setGenre(movie.getGenre().value())
                .setRating(movie.getRating().value())
                .setDescription(movie.getDescription().value())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // =======================
    // GET MOVIE
    // =======================
    @Override
    public void getMovie(GetMovieRequest request,
                         StreamObserver<MovieDto> responseObserver) {

        Movie movie = getMovieHandler.handle(
                new GetMovieQuery(request.getMovieId())
        );

        MovieDto response = MovieDto.newBuilder()
                .setMovieId(movie.getId())
                .setTitle(movie.getTitle().value())
                .setGenre(movie.getGenre().value())
                .setRating(movie.getRating().value())
                .setDescription(movie.getDescription().value())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // =======================
    // DELETE MOVIE
    // =======================
    @Override
    public void deleteMovie(DeleteMovieRequest request,
                            StreamObserver<DeleteResponse> responseObserver) {

        deleteMovieHandler.handle(
                new DeleteMovieCommand(request.getMovieId())
        );

        DeleteResponse response = DeleteResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Movie deleted")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // =======================
    // STREAM ALL MOVIES
    // =======================
    @Override
    public void streamMovies(Empty request,
                             StreamObserver<MovieDto> responseObserver) {

        var movies = movieRepository.findAll();

        movies.forEach(movie -> {
            MovieDto dto = MovieDto.newBuilder()
                    .setMovieId(movie.getId())
                    .setTitle(movie.getTitle().value())
                    .setGenre(movie.getGenre().value())
                    .setRating(movie.getRating().value())
                    .setDescription(movie.getDescription().value())
                    .build();

            responseObserver.onNext(dto);
        });

        responseObserver.onCompleted();
    }
}