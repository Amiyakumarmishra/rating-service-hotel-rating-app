package com.amiya.hoteratingapp.ratingService.service;

import java.util.List;

import com.amiya.hoteratingapp.ratingService.entity.RatingEntity;

public interface RatingService {
	
	RatingEntity createRating(RatingEntity rating);
	
	RatingEntity getRatingEntityById(String id);
	
	List<RatingEntity> getAllRatingEntity();
	
	List<RatingEntity> getRatingByUserId(String userId);
	
	
}
