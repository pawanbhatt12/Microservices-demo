package com.journey.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.journey.model.Hotel;
import com.journey.service.HotelService;

@RestController
public class HotelController {

	@Autowired
	HotelService hotelService;
	
	@PostMapping(path = "/hotel/api/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	private void saveHotel(@RequestBody Hotel hotel, HttpServletRequest request, HttpServletResponse response) {
		
		hotelService.saveHotel(hotel);
		response.setStatus(HttpStatus.CREATED.value());
	}
	
}
