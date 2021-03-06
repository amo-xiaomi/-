package com.neuedu.shop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.neuedu.shop.pojo.Category;
import com.neuedu.shop.pojo.Product;
import com.neuedu.shop.service.CategoryService;
import com.neuedu.shop.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	@Autowired
	private CategoryService servicec;
	@RequestMapping("/back/findAll.product")
	public String findAll(ModelMap map) {
		List<Product>p=service.findAll();
		map.addAttribute("p",p);
		return "forward:product_list.jsp";
	}
	@RequestMapping("/back/delete.product")
	public String delete(int id) {
		service.delete(id);
		return "redirect:findAll.product";
	}
	
	@RequestMapping("/back/findByIdToReser.product")
	public String findByIdToResst(int id,ModelMap map) {
		Product p=service.findById(id);
		
		map.addAttribute("p",p);
		return "forward:product_reset.jsp";
	}
	
	@RequestMapping("/back/reset.product")
	public String reset(int id,String name,String descr,Double np,Double mp,int cid) {
		service.reset(id, name, descr, np,mp,cid);
		return "findAll.product";
	}
	
	@RequestMapping("/back/insert.product")
	public String insert(Product p,@RequestParam("file")CommonsMultipartFile file,HttpServletRequest request) {
		service.insert(p,file,request);
		System.out.println(p);
		return "redirect:findAll.product";
	}
	@RequestMapping("/back/findByKeywords.product")
	public String findByKeywords(String keywords,ModelMap map) {
		List<Product>p =service.findByKeywords(keywords);
		map.addAttribute("p", p);
		return "forward:product_search.jsp";
	}

	
}
