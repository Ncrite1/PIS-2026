package com.query;

public final class GetWatchlistQuery {

    private final Long userId;

    public GetWatchlistQuery(Long userId) {
        if (userId == null || userId <= 0) {
            throw new IllegalArgumentException("userId must be positive");
        }
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }
}