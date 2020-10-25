package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//веб-запрос
@RequestMapping("/hello")
public class HelloWorldController {
	
	
	@RequestMapping("/showForm")
	// отображает страницу helloworld-form.jsp
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
		public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping ("/processFormVersionTwo")
	// Httpservletrequest получает отправленные сервлету данные /Model -контейнер для информации
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// читает  request parameter из Html которую заполнили в studentName
		String theName =request.getParameter("studentName");
		//делает все буквы заглавными
		theName=theName.toUpperCase();
		//добавляем текст к  имени 
		String result ="Hello "+theName;
		//добавление "message" в передаваемую модель данных
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	//processFormVersionThree имеет тоже предназачение что и /processFormVersionTwo ,но в примере ниже используем
	//аннотацию @Requestparam и она сокращает код на 2 строки
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVerssionThree(
			//@RequestParam читает http server request 
			//и связывает studentName со String theName
	@RequestParam("studentName") String theName ,Model model) {		
	theName=theName.toUpperCase();
	
	String result ="Hi "+theName;
	
	model.addAttribute("message", result);
	return "helloworld";
	}
	}
	
