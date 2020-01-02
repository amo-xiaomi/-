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
		return mapper.findAll();
	}

	@Override
	public void addRootCategory(String name, String descr) {
		mapper.addRootCategory(name, descr);
	}

	@Override
	public List<Category> findToTree() {
		return mapper.findToTree();
	}

	@Override
	public void addChildCategory(String name,String descr,int pid,int grade) {
		//查父级别的grade
		//int grade = mapper.findByParentId(pid);
		//添加操作
		mapper.addChildCategory(new Category(name,descr,pid,grade+1));
		//更新父节点
		mapper.updateParent(pid);
	}

	@Override
	public Category findById(int id) {
		return mapper.findById(id);
	}

	@Override
	public void resetDescr(int id,String descr) {
		mapper.resetDescr(id, descr);
	}

	@Override
	public String findParname(int pid) {
		// TODO Auto-generated method stub
		return mapper.findParname(pid);
	}

	@Override
	public List<Category> findGrade() {
		// TODO Auto-generated method stub
		return mapper.findGrade();
	}

	@Override
	public void addChildCategory(String name, String descr, int pid) {
		// TODO Auto-generated method stub
		
	}

}
