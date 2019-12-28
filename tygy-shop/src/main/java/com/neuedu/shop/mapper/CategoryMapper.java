package com.neuedu.shop.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.neuedu.shop.pojo.Category;

@Repository
public interface CategoryMapper {

	List<Category> findAll();
}
