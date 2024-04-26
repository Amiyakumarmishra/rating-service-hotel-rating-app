package com.amiya.hoteratingapp.ratingService.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GolbalExceptionHandler {
	
	public ResponseEntity<Map<String,Object>> resourceNotFoundExceptionHandler(ResourceNotFoundException ex){
		
		Map<String,Object> ret = new HashMap<>();
		ret.put("Status", HttpStatus.NOT_FOUND);
		ret.put("message", ex.getMessage());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ret);
	}
	
}
