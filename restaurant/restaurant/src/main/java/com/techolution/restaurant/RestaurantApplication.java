package com.techolution.restaurant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.techolution.restaurant.service.RestaurantService;

@SpringBootApplication
public class RestaurantApplication {
	private static final Logger logger = LoggerFactory.getLogger(RestaurantApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RestaurantApplication.class, args);
	}

	@Autowired
	RestaurantService restaurantService;

	@Bean
	public CommandLineRunner run() {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				logger.debug("Application has started!");
				restaurantService.performWithAbsolutePath("/Users/TresmDisk/Desktop/personal_work/restaurant/src/main/resources/input.txt");
			}
		};
	}
}

