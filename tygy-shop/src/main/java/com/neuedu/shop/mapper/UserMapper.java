package com.neuedu.shop.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.neuedu.shop.pojo.User;
@Repository
public interface UserMapper {

	public List<User> findAll();
	/**
	 * 添加的方法
	 */
	void insert(User user);
	
	/**
	 * 删除的方法
	 */
	void delete(Integer id);
	
/**
 * 重置用户密码
 */
	void resetPassword(Integer id);
}
