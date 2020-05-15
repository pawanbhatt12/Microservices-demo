package com.journey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JourneyGetApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(JourneyGetApp.class, args);
    }
}
