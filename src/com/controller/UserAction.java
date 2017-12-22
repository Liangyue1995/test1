/**
 * 
 */
package com.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.entity.UserEntity;
import com.service.UserDaoServiceImpl;

/**
 * @author ¡∫‘√
 *
 */
@RequestMapping(value="user")
@Controller
public class UserAction {
@Autowired
private UserDaoServiceImpl dao;
  @RequestMapping(value="UserfindAll")
  public ModelAndView UserfindAll(ModelAndView model){
	  List<UserEntity> list = dao.UserfindAll();
	  model.addObject("list",list);
	 model.setViewName("index");
	return model;
	  
  }
  
  @RequestMapping(value="UserfindById")
  public ModelAndView UserfindById(ModelAndView model, String id){
	 UserEntity userfindById = dao.UserfindById(id);
	  model.addObject("userfindById",userfindById);
	 model.setViewName("index");
	return model;
	  
  }
  @RequestMapping(value="UserDelete")
  public ModelAndView UserDelete(ModelAndView model, String id){
	         dao.UserDelete(id);	         
	 model.setViewName("redirect:/user/userfindAll");
	return model;
	  
  }
  @RequestMapping(value="UserAdd")
  public ModelAndView UserAdd(HttpServletRequest req, ModelAndView model){
	  String id = req.getParameter("id");
	  String username = req.getParameter("username");
	  String password = req.getParameter("password");
	  String nickname = req.getParameter("nickname");
	  String ispass = req.getParameter("ispass");
	  UserEntity u = new UserEntity(id, username, password, nickname,ispass);
	  dao.UserAdd(u);
	  model.setViewName("redirect:/user/userfindAll");
	  return model;	  
  }
  @RequestMapping(value="UserUpdate")
  public ModelAndView UserUpdate(HttpServletRequest req, ModelAndView model){
	  
	  String username = req.getParameter("username");
	  String password = req.getParameter("password");
	  String nickname = req.getParameter("nickname");
	  String ispass = req.getParameter("ispass");
	  UserEntity u = new UserEntity(username, password, nickname,ispass);
	  dao.UserUpdate(u);
	  model.setViewName("redirect:/user/userfindAll");
	  return model;	  
  }
  //UserfindByName
  @RequestMapping(value="login")
  public ModelAndView login(ModelAndView model, String username,String password){
	  UserEntity login = dao.login(username, password);
	  model.addObject("login",login);
	  model.setViewName("index");
	return model;
	  
  }
}
