package com.karthik.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.karthik.springboot.model.User;
import com.karthik.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
