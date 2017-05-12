package com.play.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.play.boot.entity.User;
import com.play.boot.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;

	public void initTable() {
		userMapper.createTable();
	}

	public User save(String name, int age) {
		User user = new User(name, age);
		userMapper.insert(user);
		return user;
	}

	public List<User> allUsers() {
		List<User> users = userMapper.findAll();
		return users;
	}
}
