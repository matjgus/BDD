package com.example.demo.info;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController {
	@GetMapping("/")
	public String getIndexPage(HttpServletRequest request, Model model) {
		
		model.addAttribute("name", request.getParameter("name"));
		
		return "index";
	}
}
