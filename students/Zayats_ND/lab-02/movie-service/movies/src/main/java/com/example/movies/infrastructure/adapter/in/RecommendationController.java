@RestController
@RequestMapping("/api/recommendations")
public class RecommendationController {

    private final GetRecommendationsUseCase getRecommendationsUseCase;

    public RecommendationController(GetRecommendationsUseCase getRecommendationsUseCase) {
        this.getRecommendationsUseCase = getRecommendationsUseCase;
    }

    @GetMapping("/{userId}")
    public List<Recommendation> get(@PathVariable Long userId) {
        return getRecommendationsUseCase.getForUser(userId);
    }
}