package com.neuedu.shop.service;

import java.util.List;

import com.neuedu.shop.pojo.Product;

public interface ProductService {
	List<Product> findAll();
	void delete(Integer id);
}