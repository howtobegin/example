package org.example.controller;

import java.util.List;

import org.example.bean.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	private static final String SUCCESS= "success";
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value = {"", "/list"})
	public List<User> list() {
		return userService.findAll();
	}
	
	@ResponseBody
	@RequestMapping(value = "create")
	public String create(User user) {
		userService.save(user);
		return SUCCESS;
	}
}
