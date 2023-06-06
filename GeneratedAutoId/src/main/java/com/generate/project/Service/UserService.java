package com.generate.project.Service;

import org.springframework.stereotype.Service;

import com.generate.project.model.User;

@Service
public interface UserService {
	
       User generatedid(User user) throws Exception;
       


}
