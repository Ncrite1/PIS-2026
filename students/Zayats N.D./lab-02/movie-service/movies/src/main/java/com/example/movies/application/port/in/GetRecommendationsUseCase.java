package com.example.movies.application.port.in;

import java.util.List;
import com.example.movies.domain.model.Recommendation;

public interface GetRecommendationsUseCase {
    List<Recommendation> getForUser(Long userId);
}