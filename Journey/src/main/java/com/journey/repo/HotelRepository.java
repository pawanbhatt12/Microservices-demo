package com.journey.repo;

import org.springframework.data.repository.CrudRepository;

import com.journey.model.Hotel;

public interface HotelRepository extends CrudRepository<Hotel, Long>{

}
