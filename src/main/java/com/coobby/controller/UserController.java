package com.coobby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("user")
@Controller
public class UserController {

	@RequestMapping("/{step}")
	public String viewPage(@PathVariable String step) {
		return "user/"+step;
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "recipedetail";
	}
}
