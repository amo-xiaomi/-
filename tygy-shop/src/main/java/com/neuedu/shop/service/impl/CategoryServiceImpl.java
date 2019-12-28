package com.neuedu.shop.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neuedu.shop.mapper.CategoryMapper;
import com.neuedu.shop.pojo.Category;
import com.neuedu.shop.service.CategoryService;
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryMapper mapper;

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return mapper.findAll();
	}
}
