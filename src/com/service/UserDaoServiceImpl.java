package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.entity.UserEntity;
import com.util.CommonUtil;
@Service
public class UserDaoServiceImpl implements UserDaoService{
	@Autowired
    private UserDao dao;
    
	@Override
	public void UserAdd(UserEntity user) {
		if (user!=null) {
			if (user.getId()==null||"".equals(user.getId())) {
				user.setId(CommonUtil.getUUID());;
			}
		}
		dao.UserAdd(user);
	}

	@Override
	public void UserUpdate(UserEntity user) {
		// TODO Auto-generated method stub
		dao.UserUpdate(user);
	}

	@Override
	public void UserDelete(String id) {
		// TODO Auto-generated method stub
		dao.UserDelete(id);
	}

	@Override
	public UserEntity UserfindById(String id) {
		// TODO Auto-generated method stub
		return dao.UserfindById(id);
	}

	@Override
	public List<UserEntity> UserfindAll() {
		// TODO Auto-generated method stub
		return dao.UserfindAll();
	}

	@Override
	public UserEntity login(String username, String password) {
		  UserEntity user = dao.UserfindByName(username);
		  if (user != null) {
			if (user.getPassword().equals(password)) {
				return user;
			}
		}		 
		return null;
	}

}
