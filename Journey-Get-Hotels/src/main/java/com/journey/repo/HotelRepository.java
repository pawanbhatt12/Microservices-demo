package com.journey.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.journey.model.Hotel;

public interface HotelRepository extends PagingAndSortingRepository<Hotel, Long>{

}
