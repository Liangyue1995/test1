package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.entity.UserEntity;
import com.service.ActivitiServiceImpl;
import com.service.UserDaoServiceImpl;
@RequestMapping(value="/loginC")
@Controller
public class LoginAction {
	@Autowired
	private ActivitiServiceImpl aser;
	@Autowired
	private UserDaoServiceImpl user;
	 @RequestMapping(value="login")
	 public ModelAndView login(ModelAndView model,UserEntity u){
		 String username = u.getUsername();
		 String password = u.getPassword();
		 UserEntity u1 = user.login(username, password);
		 if (u1!=null) {
			model.setViewName("index");
		} else {
			model.setViewName("login");
		}
		return model;
		 
	 }
}
