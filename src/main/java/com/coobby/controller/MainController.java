package com.coobby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("user/mainpage")
public class MainController {

	@RequestMapping("index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "recipedetail";
	}
	
	@RequestMapping("mainpage")
	public String mainpage() {
		return "mainpage";
	}
	
	@RequestMapping("joinmember")
	public String joinmember() {
		return "joinmember";
	}
	
	@RequestMapping("loginpage")
	public String loginpage() {
		return "loginpage";
	}
	
	@RequestMapping("searchpage")
	public String searchpage() {
		return "searchpage";
	}
	
	@RequestMapping("searchresultpage")
	public String searchresultpage() {
		return "searchresultpage";
	}
	
	@RequestMapping("selectauthpage")
	public String selectauthpage() {
		return "selectauthpage";
	}
	
	@RequestMapping("emailauthpage")
	public String emailtauthpage() {
		return "emailauthpage";
	}

	
//	@RequestMapping("demo-furniture-about")
//	public String demofurnitureabout() {
//		return "/demo-furniture-about";
//	}
	
//	@RequestMapping("demo-furniture-contact")
//	public String demofurniturecontact() {
//		return "/demo-furniture-contact";
//	}
	
//	@RequestMapping("searchpage")
//	public String searchpage() {
//		return "/searchpage";
//	}
	
//	@RequestMapping("demo-furniture-single")
//	public String demofurnituresingle() {
//		return "/demo-furniture-single";
//	}
	
//	@RequestMapping("mainnindex")
//	public String mainnindex() {
//		return "/mainn/index";
//	}
}
