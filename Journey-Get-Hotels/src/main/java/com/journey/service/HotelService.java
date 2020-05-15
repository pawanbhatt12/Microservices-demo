package com.journey.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.journey.model.Hotel;

@Service
/***
 * HotelService
 * @author 
 *
 */
public interface HotelService {

	/***
	 * getHotels
	 * @return List<Hotel>
	 */
	public List<Hotel> getHotels(int pageno, int pagesize);
}
