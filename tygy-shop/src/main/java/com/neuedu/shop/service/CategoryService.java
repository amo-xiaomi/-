package com.neuedu.shop.service;

import java.util.List;

import com.neuedu.shop.pojo.Category;

public interface CategoryService {
	List<Category>findAll();
	
	void addRootCategory(String name,String descr);
	
	List<Category> findToTree();
	
	void addChildCategory(String name,String descr,int pid);
	
	Category findById(int id);
	
	void resetDescr(int id,String descr);
	
	String findParname(int pid);
}
