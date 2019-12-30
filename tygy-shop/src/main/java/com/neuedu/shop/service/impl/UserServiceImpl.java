package com.neuedu.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neuedu.shop.mapper.UserMapper;
import com.neuedu.shop.pojo.User;
import com.neuedu.shop.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired // 自动注入dependecy injection
	private UserMapper mapper;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return mapper.findAll();
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		mapper.insert(user);
	
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		mapper.delete(id);
		
	}

	@Override
	public void resetPassword(Integer id) {
		// TODO Auto-generated method stub
		mapper.resetPassword(id);
	}

}
