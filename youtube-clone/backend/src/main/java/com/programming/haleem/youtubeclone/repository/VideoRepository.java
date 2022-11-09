package com.programming.haleem.youtubeclone.repository;

import com.programming.haleem.youtubeclone.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video, String> {
}
