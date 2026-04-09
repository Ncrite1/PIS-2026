@Configuration
public class DependencyInjectionConfig {

    @Bean MovieRepository movieRepo() { return new InMemoryMovieRepository(); }
    @Bean UserRepository userRepo() { return new InMemoryUserRepository(); }
    @Bean WatchlistRepository watchlistRepo() { return new InMemoryWatchlistRepository(); }
    @Bean RecommendationClient recClient() { return new ExternalRecommendationClient(); }

    @Bean SearchMoviesUseCase searchMovies(MovieRepository repo) { return new MovieService(repo); }
    @Bean GetMovieDetailsUseCase movieDetails(MovieRepository repo) { return new MovieService(repo); }
    @Bean AddToWatchlistUseCase addWatchlist(WatchlistRepository wRepo, MovieRepository mRepo) { return new WatchlistService(wRepo, mRepo); }
    @Bean GetRecommendationsUseCase getRecs(RecommendationClient client) { return new RecommendationService(client); }
    @Bean UserService userService(UserRepository repo) { return new UserService(repo); }

    @Bean MovieController movieController(SearchMoviesUseCase search, GetMovieDetailsUseCase details) { return new MovieController(search, details); }
    @Bean WatchlistController watchlistController(AddToWatchlistUseCase add) { return new WatchlistController(add); }
    @Bean RecommendationController recController(GetRecommendationsUseCase rec) { return new RecommendationController(rec); }
    @Bean UserController userController(UserService userService) { return new UserController(userService); }
}