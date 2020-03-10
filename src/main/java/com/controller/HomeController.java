package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.model.User;
@Controller
public class HomeController {
	public HomeController() {
		System.out.println("Bean has already created..!!");
	}

	@RequestMapping("/")
	public  String Index() {
		return"index";
		
		
	}
	
	@RequestMapping("/login")
	public  ModelAndView Login() {
		ModelAndView modelAndView = new ModelAndView("login");
	    modelAndView.addObject("userName", "Thuy Hang");
	    
	    User userObj= new User();
	    userObj.setAge("10");
	    userObj.setName("Nhung lua");
	    userObj.setAdress("abc");
	    
	    modelAndView.addObject("user", userObj);
	    
	    List<User> userList = new ArrayList<User>();
	    userList.add(userObj);
	    
	    modelAndView.addObject("users", userList);
	    return modelAndView;
	}
	
	@RequestMapping("/register")
	public  String Register() {
		return"register";
	}
	
	@RequestMapping("/user")
	public  String User() {
		return"user";
	}
	
	
}
