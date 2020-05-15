package com.journey.service;

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
	 * saveHotel
	 * @param hotel
	 * @return 
	 */
	public void saveHotel(Hotel hotel);

}
