package com.amiya.hoteratingapp.ratingService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amiya.hoteratingapp.ratingService.entity.RatingEntity;
import com.amiya.hoteratingapp.ratingService.service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	private RatingService ratingService;
	
	@PostMapping
	public ResponseEntity<RatingEntity> createRating(@RequestBody RatingEntity rating){
		
		return ResponseEntity.ok(ratingService.createRating(rating));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<RatingEntity> getRatingEntityById(@PathVariable("id") String id) {
		
		return ResponseEntity.ok(ratingService.getRatingEntityById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<RatingEntity>> getAllRating(){
		
		return ResponseEntity.ok(ratingService.getAllRatingEntity());
	}
	
	@GetMapping("/userId/{id}")
	public ResponseEntity<List<RatingEntity>> getRatingByUserId(@PathVariable("id") String id){
		
		return ResponseEntity.ok(ratingService.getRatingByUserId(id));
	}

}
