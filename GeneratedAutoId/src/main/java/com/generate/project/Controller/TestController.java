package com.generate.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generate.project.Service.UserService;
import com.generate.project.model.User;

@RestController
public class TestController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/genertae-AutoId")
	public User getID(User uaer) throws Exception {
		
		return  userService.generatedid(uaer);
	}
}
