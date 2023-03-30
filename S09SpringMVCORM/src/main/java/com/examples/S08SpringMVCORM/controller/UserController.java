package com.examples.S08SpringMVCORM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.examples.S08SpringMVCORM.entity.User;
import com.examples.S08SpringMVCORM.exception.UserAlreadyExistsException;
import com.examples.S08SpringMVCORM.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/register")
	public String registeruser() {
		return "userreg";
	}

	@RequestMapping(value = "/registeruser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		int result;
		try {
			result = userService.save(user);
			model.addAttribute("message", "User created with id " + result);
		} catch (UserAlreadyExistsException e) {
			model.addAttribute("message", e.getMessage());
		}
		List<User> users = userService.getUsers();
		model.addAttribute("users",users);
		return "userreg";
	}

	@RequestMapping("/users")
	public String getusers(ModelMap model) {
		List<User> users = userService.getUsers();
		model.addAttribute("users",users);
		return "displayusers" ;
	}
}
