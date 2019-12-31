package com.neuedu.shop.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.neuedu.shop.pojo.Product;
@Repository
public interface ProductMapper {
	List<Product> findAll();
	
	
	void delete(Integer id);
}
