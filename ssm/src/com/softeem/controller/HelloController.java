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
	
	
	// ����һ��url   ModelMap map ģ������ �� ��ŵ���Ҫ���ݵ�ǰ�˵�����
//	@RequestMapping(params="password", headers ="Host", value="/hello",method=RequestMethod.GET)
//	public String hello(User user,ModelMap map) {
//		
//		System.out.println(user.getName()+"���к���, "+user.getPassword());		
//		// ����ת��������Я�����ݣ�  forward
//		// �ض���  redirect		
//		// return "index";  // �߼���ͼ��
//		// return "forward:/WEB-INF/index.jsp";  //����ת��			
//		// ��ǰ�˴�������
//		//request.setAttribute("username", user.getName());
//		// �����ݱ��浽ģ�����ݶ����� ���൱�ڴ洢��request�У�
//		//map.put("username", user.getName());
////		return "forward:/hello/index"; //����ת��
//		
//		//return "redirect:/WEB-INF/index.jsp"; // �ض����޷�����/WEB-INF/Ŀ¼�µ�ҳ��		
//		// return "redirect:/index.jsp";  // �ض���
//		// return "redirect:/hello/index";  // �ض��� ��̨��url 
//		 
//	}
	
	
	@RequestMapping(params="password", headers ="Host", value="/hello",method=RequestMethod.GET)
	public ModelAndView hello(User user) {		
		System.out.println( user.getUser_name() +"���к���, "+user.getPassword());		
		
		 ModelAndView mv = new ModelAndView();
		 // ��ģ���������������
		 mv.addObject("username", user.getUser_name());
		 
		 // �����߼���ͼ��
		 mv.setViewName("index");
		 
		 return mv;
	}
	
	@RequestMapping("/index")
	public String toIndex(){
		System.out.println("-----------------------------");
		return "index";
	}
	
	
	@RequestMapping("/getJson")
	@ResponseBody  // ����Ӧ������ת��Ϊjson����
	public String getJson() {
		return "aaa";
	}
}
