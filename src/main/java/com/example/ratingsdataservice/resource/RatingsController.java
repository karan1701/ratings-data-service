package com.example.ratingsdataservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ratingsdataservice.model.Rating;
import com.example.ratingsdataservice.model.UserRatings;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsController {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 3);
	}

	@RequestMapping("/users/{userId}")
	public UserRatings getRatingByUser(@PathVariable("userId") String userId) {

		List<Rating> ratings = Arrays.asList(new Rating("123", 3), new Rating("456", 4), new Rating("789", 5));
		UserRatings userRatings = new UserRatings();
		userRatings.setRatings(ratings);
		return userRatings;
	}
}
