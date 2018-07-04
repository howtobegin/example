package org.example.service;

import java.util.List;

import org.example.bean.User;
import org.example.repository.UserRepsoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepsoitory repository;
	
	public User save(User user) {
		return repository.save(user);
	}
	
	public List<User> findAll() {
		return repository.findAll();
	}
}
