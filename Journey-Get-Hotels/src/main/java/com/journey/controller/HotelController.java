package com.journey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.journey.model.Hotel;
import com.journey.service.HotelService;

@RestController
public class HotelController {

	@Autowired
	HotelService hotelService;
	
	@GetMapping(path = "/hotel/api/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Hotel>> getHotels(@RequestParam(name = "page")int page, @RequestParam(name = "size")int size) {
		
		return new ResponseEntity<>(hotelService.getHotels(page, size), HttpStatus.OK);
	}
}
