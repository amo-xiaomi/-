package com.neuedu.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.shop.pojo.Admin;
import com.neuedu.shop.service.AdminService;


@Controller
public class AdminController {
	@Autowired
	private AdminService service ;
	
	@RequestMapping("/back/findAll.admin")
	public String findAll(ModelMap map) {
		List <Admin> admins=service.findAll();
		System.out.println(admins);
		//将查询到的结果绑定到map对象当中
		map.addAttribute("admins",admins);
		//告诉controller层要将结果交给哪个页面显示
		return "admin_list.jsp";
	}
}
