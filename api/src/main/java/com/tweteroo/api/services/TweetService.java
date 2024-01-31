package com.tweteroo.api.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tweteroo.api.dtos.TweetDTO;
import com.tweteroo.api.models.TweetModel;
import com.tweteroo.api.models.UserModel;
import com.tweteroo.api.repositories.TweetRepository;
import com.tweteroo.api.repositories.UserRepository;

@Service
public class TweetService {
  final TweetRepository tweetRepository;
  final UserRepository userRepository;

  TweetService(TweetRepository tweetRepository, UserRepository userRepository) {
    this.tweetRepository = tweetRepository;
    this.userRepository = userRepository;
  }

  public Optional<TweetModel> save(TweetDTO tweetDTO) {
    Optional<UserModel> user = userRepository.findById(tweetDTO.getUserId());

    if (user.isEmpty()) {
      return Optional.empty();
    }

    TweetModel tweetModel = new TweetModel(tweetDTO, user.get());
    return Optional.of(tweetRepository.save(tweetModel));
  }

}
