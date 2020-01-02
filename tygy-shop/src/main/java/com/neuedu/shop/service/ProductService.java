package com.neuedu.shop.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.neuedu.shop.pojo.Product;

public interface ProductService {
	List<Product> findAll();
	void delete(Integer id);
	
	void reset(int id,String name,String descr,Double np,Double mp,int cid);
	
	Product findById(int id);
	
	void insert(Product p,CommonsMultipartFile file,HttpServletRequest request);
	
	List<Product> findByKeywords(String keywords);
}