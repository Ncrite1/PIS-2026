@RestController
@RequestMapping("/api/watchlist")
public class WatchlistController {

    private final AddToWatchlistUseCase addToWatchlistUseCase;

    public WatchlistController(AddToWatchlistUseCase addToWatchlistUseCase) {
        this.addToWatchlistUseCase = addToWatchlistUseCase;
    }

    @PostMapping
    public void add(@RequestBody AddToWatchlistRequest request) {
        addToWatchlistUseCase.add(request.toCommand());
    }
}