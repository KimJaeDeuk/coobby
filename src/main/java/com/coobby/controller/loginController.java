package com.coobby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//@RequestMapping("user/mainpage")
public class loginController {
	@RequestMapping("joinmember")
	public String joinmember() {
		return "joinmember";
	}
	
	@RequestMapping("loginpage")
	public String loginpage() {
		return "loginpage";
	}
	
	@RequestMapping("selectauthpage")
	public String selectauthpage() {
		return "selectauthpage";
	}
	
	@RequestMapping("emailauthpage")
	public String emailtauthpage() {
		return "emailauthpage";
	}


}
