package com.health.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

	@GetMapping("/")
	public String call(ModelMap map) {
		map.addAttribute("Welcome", "World of Spring MVC from a1");
		return "showMessage";
	}
}
