package com.prog39599.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
	
	@RequestMapping("/welcome")
	public ModelAndView hellowWorld() {
		
		String message = "<br><div style = 'text-align:center;'>"
				+ "<h3>*******Hello World, Spring MVC Tutorial </h3>"
				+ "This message is coming from your Java Instructor *******</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}

}
