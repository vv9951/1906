package com.softeem.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.softeem.pojo.User;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	
	// 定义一个url   ModelMap map 模型数据 ， 存放的是要传递到前端的数据
//	@RequestMapping(params="password", headers ="Host", value="/hello",method=RequestMethod.GET)
//	public String hello(User user,ModelMap map) {
//		
//		System.out.println(user.getName()+"打招呼了, "+user.getPassword());		
//		// 请求转发：可以携带数据，  forward
//		// 重定向：  redirect		
//		// return "index";  // 逻辑视图名
//		// return "forward:/WEB-INF/index.jsp";  //请求转发			
//		// 向前端传递数据
//		//request.setAttribute("username", user.getName());
//		// 将数据保存到模型数据对象中 （相当于存储在request中）
//		//map.put("username", user.getName());
////		return "forward:/hello/index"; //请求转发
//		
//		//return "redirect:/WEB-INF/index.jsp"; // 重定向：无法到达/WEB-INF/目录下的页面		
//		// return "redirect:/index.jsp";  // 重定向
//		// return "redirect:/hello/index";  // 重定向到 后台的url 
//		 
//	}
	
	
	@RequestMapping(params="password", headers ="Host", value="/hello",method=RequestMethod.GET)
	public ModelAndView hello(User user) {		
		System.out.println( user.getUser_name() +"打招呼了, "+user.getPassword());		
		
		 ModelAndView mv = new ModelAndView();
		 // 向模型数据中添加数据
		 mv.addObject("username", user.getUser_name());
		 
		 // 设置逻辑视图名
		 mv.setViewName("index");
		 
		 return mv;
	}
	
	@RequestMapping("/index")
	public String toIndex(){
		System.out.println("-----------------------------");
		return "index";
	}
	
	
	@RequestMapping("/getJson")
	@ResponseBody  // 将相应的数据转换为json数据
	public String getJson() {
		return "aaa";
	}
}
