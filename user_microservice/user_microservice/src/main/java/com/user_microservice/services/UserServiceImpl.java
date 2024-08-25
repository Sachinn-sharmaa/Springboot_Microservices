package com.user_microservice.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user_microservice.entity.User;
@Service
public class UserServiceImpl implements UserServiceInter {
	
	//fake User list
	List<User> list = List.of(new User(1311L, "Sachin Sharma", "7836034521"),
			new User(1312L, "Tushar Sharma", "7836454521"), 
			new User(1311L, "Yogesh Sharma", "784847521")); 

	@Override
	public User gerUser(Long id) {
		
		return this.list.stream().filter(user-> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
