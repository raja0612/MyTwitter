package com.aws.mytwitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aws.mytwitter.entity.Tweet;

//@RepositoryRestResource(collectionResourceRel="Tweet", path="tweets")
public interface TweetRepository extends JpaRepository<Tweet, String> {

}
