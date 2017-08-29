package com.aws.mytwitter.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aws.mytwitter.entity.Tweet;
import com.aws.mytwitter.repository.TweetRepository;

@RestController
public class TWeetController {

	@Autowired
	private TweetRepository tweetRepository;

	@GetMapping("/tweets")
	public @ResponseBody List<Tweet> getAllTweets() {
		return tweetRepository.findAll();
	}
	
	@PostMapping("/addDummyTweets")
	public void addDummyTweets(@RequestBody Tweet tweet){
		 tweet.setDate(new Date());
		 tweetRepository.save(tweet);
		
	}
	
	

}
