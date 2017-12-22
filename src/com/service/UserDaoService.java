package com.service;

import java.util.List;

import com.entity.UserEntity;

public interface UserDaoService {
	void UserAdd(UserEntity user);
	void UserUpdate(UserEntity user);
	void UserDelete(String id);
	UserEntity UserfindById(String id);
	List<UserEntity> UserfindAll();
	UserEntity login(String username,String password);
}
