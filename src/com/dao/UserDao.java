package com.dao;

import java.util.List;

import com.entity.UserEntity;

public interface UserDao {
void UserAdd(UserEntity user);
void UserUpdate(UserEntity user);
void UserDelete(String id);
UserEntity UserfindById(String id);
List<UserEntity> UserfindAll();

UserEntity UserfindByName(String name);
}
