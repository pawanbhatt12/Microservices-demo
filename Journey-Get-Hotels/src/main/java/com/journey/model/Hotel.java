package com.journey.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity(name = "Hotel")
@Data
public class Hotel {

	@SequenceGenerator(
            name = "hotelId_generator",
            sequenceName = "id_sequence",
            initialValue = 1000
    )
	@GeneratedValue(generator = "hotelId_generator")
	@Id
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "rating")
	private String rating;
}
