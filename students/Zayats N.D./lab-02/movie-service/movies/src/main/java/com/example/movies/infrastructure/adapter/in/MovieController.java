@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final SearchMoviesUseCase searchMoviesUseCase;
    private final GetMovieDetailsUseCase getMovieDetailsUseCase;

    public MovieController(SearchMoviesUseCase searchMoviesUseCase,
                           GetMovieDetailsUseCase getMovieDetailsUseCase) {
        this.searchMoviesUseCase = searchMoviesUseCase;
        this.getMovieDetailsUseCase = getMovieDetailsUseCase;
    }

    @GetMapping("/search")
    public List<Movie> search(SearchMoviesRequest request) {
        return searchMoviesUseCase.search(request.toCommand());
    }

    @GetMapping("/{id}")
    public Movie getById(@PathVariable Long id) {
        return getMovieDetailsUseCase.getById(id);
    }
}