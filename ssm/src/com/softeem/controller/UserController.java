package com.softeem.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.softeem.pojo.User;

@Controller
@RequestMapping("/user")
public class UserController {

	
	@RequestMapping("/toAddUser")
	public String toAddUser() {
		return "addUser";
	}
	
	
	@RequestMapping("/addUser")
	@ResponseBody
	public List<User> addUser(User user) {
		// µ÷ÓÃUserService   
		
		Map map = new HashMap();
		map.put("message",true);
		
		List list = new  ArrayList();
		list.add(user);
		list.add(map);
		list.add("aaa");
		
		return list;
	}
}
