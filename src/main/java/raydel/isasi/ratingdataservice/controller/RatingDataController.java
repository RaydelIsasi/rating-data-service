package raydel.isasi.ratingdataservice.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import raydel.isasi.ratingdataservice.pojo.Rating;
import raydel.isasi.ratingdataservice.pojo.UserRatings;


@RestController
@RequestMapping("/ratingsdata")
public class RatingDataController {

	@PostMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieid) {
		return new Rating(movieid, 4);

	}
	
	
	@GetMapping("users/{userId}")
	public UserRatings getUserRatings(@PathVariable("userId") String userid) {
		return new UserRatings(  Arrays.asList(new Rating("1234", 4), new Rating("5678", 3)));

	}
}
