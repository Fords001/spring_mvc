package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//���-������
@RequestMapping("/hello")
public class HelloWorldController {
	
	
	@RequestMapping("/showForm")
	// ���������� �������� helloworld-form.jsp
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
		public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping ("/processFormVersionTwo")
	// Httpservletrequest �������� ������������ �������� ������ /Model -��������� ��� ����������
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// ������  request parameter �� Html ������� ��������� � studentName
		String theName =request.getParameter("studentName");
		//������ ��� ����� ����������
		theName=theName.toUpperCase();
		//��������� ����� �  ����� 
		String result ="Hello "+theName;
		//���������� "message" � ������������ ������ ������
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	//processFormVersionThree ����� ���� ������������� ��� � /processFormVersionTwo ,�� � ������� ���� ����������
	//��������� @Requestparam � ��� ��������� ��� �� 2 ������
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVerssionThree(
			//@RequestParam ������ http server request 
			//� ��������� studentName �� String theName
	@RequestParam("studentName") String theName ,Model model) {		
	theName=theName.toUpperCase();
	
	String result ="Hi "+theName;
	
	model.addAttribute("message", result);
	return "helloworld";
	}
	}
	
