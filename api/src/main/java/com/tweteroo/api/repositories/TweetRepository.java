package com.tweteroo.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.api.models.TweetModel;

public interface TweetRepository extends JpaRepository<TweetModel, Long> {

}
