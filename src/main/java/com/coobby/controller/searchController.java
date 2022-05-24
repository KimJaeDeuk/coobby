package com.coobby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("user/mainpage")
public class searchController {
	@RequestMapping("searchpage")
	public String searchpage() {
		return "searchpage";
	}
	
	@RequestMapping("searchresultpage")
	public String searchresultpage() {
		return "searchresultpage";
	}
}