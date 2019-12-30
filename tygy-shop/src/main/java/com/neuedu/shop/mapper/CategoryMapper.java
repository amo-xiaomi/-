package com.neuedu.shop.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.neuedu.shop.pojo.Category;

@Repository
public interface CategoryMapper {
	List<Category> findAll();
	void addRootCategory(String name,String descr);
	
//	findall 不适用
	List<Category> findToTree();
	
	//添加子类别
	void addChildCategory(Category category);
	/**
	 * 父级别的pid
	 * @param pid
	 * @return 父级别的grade
	 */
	int findByParentId(int pid);
	/**
	 * 
	 * 更新父节点的叶子节点为非叶子节点
	 * @param pid 父节点的id值
	 */
	void updateParent(int pid);
	
	Category findById(int id);
}
