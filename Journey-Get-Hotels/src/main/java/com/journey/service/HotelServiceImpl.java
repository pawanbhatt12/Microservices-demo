package com.journey.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.journey.model.Hotel;
import com.journey.repo.HotelRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelRepository;

	public List<Hotel> getHotels(int pageno, int pagesize) {
		
		log.info("Getting Hotels...");
		
		List<Hotel> hotels = new ArrayList<>();
		Pageable pageRequest = PageRequest.of(pageno, pagesize);
		hotelRepository.findAll(pageRequest).iterator().forEachRemaining(hotels::add);
		
		return hotels;
		
	}

}
