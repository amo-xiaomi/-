package com.neuedu.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.shop.pojo.User;

import com.neuedu.shop.service.UserService;
      
@Controller
public class UserController {
	@Autowired
	private UserService service ;
	
	@RequestMapping("/back/findAll.user")
	public String findAll(ModelMap map) {
		List <User> users=service.findAll();
		
		//将查询到的结果绑定到map对象当中
		map.addAttribute("users",users);
		//告诉controller层要将结果交给哪个页面显示转发
		return "forward:user_list.jsp";
	}
	@RequestMapping("/pre/register.user")
	public String register(User user) {
		service.insert(user);
		/*
		 * 如果有页面跳转，需要用重定向
		 */
		return "redirect:index.jsp";
	}
	@RequestMapping("/back/delete.user")
	public String delete(Integer id) {
		service.delete(id);
		return "redirect:findAll.user";
	}
}
