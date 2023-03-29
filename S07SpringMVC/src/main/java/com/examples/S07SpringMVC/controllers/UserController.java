package com.examples.S07SpringMVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examples.S07SpringMVC.model.User;

@Controller
public class UserController {

	@RequestMapping("/registeruser")
	public ModelAndView registerUser() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registeruser");
		return mv;
	}
	
	@RequestMapping(value = "/signupuser",method = RequestMethod.POST)
	public ModelAndView signUpUser(@ModelAttribute("user") User user) {
		System.out.println("Submitted details"+user.toString());
		ModelAndView mv = new ModelAndView();
		mv.addObject(user);
		mv.setViewName("registereduserresult");
		return mv;
	}
	
}
