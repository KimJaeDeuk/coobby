package com.coobby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class userQnAController {

	@RequestMapping("QnA/QnAlist")
	public String QnAlist() {
		return "/user/QnA/QnAlist";
	}
	
	@RequestMapping("QnA/QnAdetail")
	public String QnAdetail() {
		return "/user/QnA/QnAdetail";
	}
	
}
