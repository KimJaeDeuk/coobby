package com.coobby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user/login")
public class loginController {
	
	@RequestMapping("joinmember")
	public String joinmember() {
		return "/user/login/joinmember";
	}
	
	@RequestMapping("loginpage")
	public String loginpage() {
		return "/user/login/loginpage";
	}
	
	@RequestMapping("selectauthpage")
	public String selectauthpage() {
		return "/user/login/selectauthpage";
	}
	
	@RequestMapping("emailauthpage")
	public String emailtauthpage() {
		return "/user/login/emailauthpage";
	}


}
