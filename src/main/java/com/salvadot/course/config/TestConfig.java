package com.salvadot.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.salvadot.course.entities.Order;
import com.salvadot.course.entities.User;
import com.salvadot.course.repositories.OrderRepository;
import com.salvadot.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "9888888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "9777777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2020-05-20T07:35:43Z"), u1);
		Order o2 = new Order(null, Instant.parse("2020-05-20T09:52:23Z"), u2);
		Order o3 = new Order(null, Instant.parse("2020-05-20T11:02:01Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	

}
