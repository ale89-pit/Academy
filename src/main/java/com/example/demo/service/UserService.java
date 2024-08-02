package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.payload.UserDTO;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	public User createUser(UserDTO user) {
		User userSave = new User();
		
		userSave.setCognome(user.getCognome());
		userSave.setName(user.getName());
		userSave.setPassword(user.getPassword());
		userSave.setUsername(user.getUsername());
		
		// TODO Auto-generated method stub
		return repository.save(userSave);
		
	}

	
}
