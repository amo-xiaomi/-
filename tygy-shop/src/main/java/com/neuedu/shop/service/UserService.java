package com.neuedu.shop.service;

import java.util.List;

import com.neuedu.shop.pojo.User;

public interface UserService {

	List<User> findAll();

	void insert(User user);

	void delete(Integer id);
}
