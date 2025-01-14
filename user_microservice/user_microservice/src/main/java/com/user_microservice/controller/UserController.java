package com.user_microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user_microservice.entity.User;
import com.user_microservice.services.UserServiceInter;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserServiceInter userService;
	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		User user = this.userService.gerUser(userId);
		List Contacts = restTemplate.getForObject("http://contact-service/contact/user/"+ userId, List.class);
		user.setContacts(Contacts);
		return user;
	}
}
