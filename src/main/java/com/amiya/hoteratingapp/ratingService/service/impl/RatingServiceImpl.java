package com.amiya.hoteratingapp.ratingService.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amiya.hoteratingapp.ratingService.entity.RatingEntity;
import com.amiya.hoteratingapp.ratingService.exception.ResourceNotFoundException;
import com.amiya.hoteratingapp.ratingService.repository.RatingRepository;
import com.amiya.hoteratingapp.ratingService.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	private RatingRepository repo;
	@Override
	public RatingEntity createRating(RatingEntity rating) {
		// TODO Auto-generated method stub
		String id = UUID.randomUUID().toString();
		rating.setRatingId(id);
		return repo.save(rating);
	}

	@Override
	public RatingEntity getRatingEntityById(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Rating with id "+id+"not found"));
	}

	@Override
	public List<RatingEntity> getAllRatingEntity() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<RatingEntity> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		return repo.findByUserId(userId);
	}

}
