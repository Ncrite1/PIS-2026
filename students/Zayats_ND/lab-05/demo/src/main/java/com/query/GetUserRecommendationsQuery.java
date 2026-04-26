package com.query;

public final class GetUserRecommendationsQuery {

    private final Long userId;

    public GetUserRecommendationsQuery(Long userId) {
        if (userId == null || userId <= 0) {
            throw new IllegalArgumentException("userId must be positive");
        }
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }
    
}