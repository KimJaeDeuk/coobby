package com.coobby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/main")
public class MainController {
	
	@RequestMapping("mainpage")
	public String mainpage() {
		return "/user/main/mainpage";
	}

}


