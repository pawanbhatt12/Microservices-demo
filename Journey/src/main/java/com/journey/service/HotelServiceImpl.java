package com.journey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.journey.model.Hotel;
import com.journey.repo.HotelRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public void saveHotel(Hotel hotel) {
		
		log.info("Save Hotel...");
		hotelRepository.save(hotel);
		
		log.info("Hotel saved successfully...");
	}

}
