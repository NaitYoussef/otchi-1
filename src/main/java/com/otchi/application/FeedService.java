package com.otchi.application;


public interface FeedService {
    void likePost(Long postId, Long userId);

    void unlikePost(long postId, long userId);
}
