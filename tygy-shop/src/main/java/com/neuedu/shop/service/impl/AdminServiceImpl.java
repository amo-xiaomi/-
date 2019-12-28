package com.neuedu.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neuedu.shop.mapper.AdminMapper;
import com.neuedu.shop.pojo.Admin;
import com.neuedu.shop.service.AdminService;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	/**
	 * 持有持久层接口对象
	 */
		
		@Autowired //自动注入dependecy injection
		private AdminMapper mapper;
		@Override
		public List<Admin> findAll() {
			// TODO Auto-generated method stub
			return mapper.findAll();
		}
}
