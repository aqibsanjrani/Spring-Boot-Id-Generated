package com.generate.project.Service.ServiceImpl;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generate.project.Repository.UserRepository;
import com.generate.project.Service.UserService;
import com.generate.project.model.User;

@Service
public class ServiceImpl implements UserService  {
	
	@Autowired
	private UserRepository userRepository;  
	
	//private static int id=1;

	
	@Override
	public User generatedid(User user) throws Exception {
		
		 LocalDate today = LocalDate.now();

		int id= user.getAuto_id();
		 
		 if (userRepository.existsById(id)) {
	            throw new RuntimeException("ID already exists");
	        }

		
		//user.setAuto_id(id);
		user.setDated(today);
		
		userRepository.save(user);
		
		return user;
	}

}
