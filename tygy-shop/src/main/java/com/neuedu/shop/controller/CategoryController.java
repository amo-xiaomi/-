package com.neuedu.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.shop.pojo.Category;
import com.neuedu.shop.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	private CategoryService service;
	@RequestMapping("/back/findAll.category")
	public String findAll(ModelMap map) {
		List<Category> categories = service.findAll();
		map.addAttribute("categories", categories);
		return "forward:category_list.jsp";
	}
}
