package com.neuedu.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.neuedu.shop.mapper.ProductMapper;
import com.neuedu.shop.pojo.Product;
import com.neuedu.shop.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductMapper mapper;
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return mapper.findAll();
		
	}
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		mapper.delete(id);
	}

}
