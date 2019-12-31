package com.neuedu.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.shop.pojo.Product;
import com.neuedu.shop.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	@RequestMapping("/back/findAll.product")
	public String findAll(Model map) {
		List<Product>p=service.findAll();
		map.addAttribute("p",p);
		return "forward:product_list.jsp";
		//return "";
	}
	@RequestMapping("/back/delete.product")
	public String delete(int id) {
		service.delete(id);
		return "redirect:findAll.product";
	}
}

