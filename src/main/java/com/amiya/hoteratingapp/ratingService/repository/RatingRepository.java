package com.amiya.hoteratingapp.ratingService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amiya.hoteratingapp.ratingService.entity.RatingEntity;

@Repository
public interface RatingRepository extends JpaRepository<RatingEntity,String>{
	
	List<RatingEntity> findByUserId(String id);
}
