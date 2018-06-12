package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@RequestParam("insert") String insert,Model m) {
		insert=insert.toUpperCase();
		m.addAttribute("message",insert);
		return "helloworld";
	}
}
