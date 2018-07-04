package org.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webapp.bean.User;
import org.webapp.repository.UserRepsoitory;

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
