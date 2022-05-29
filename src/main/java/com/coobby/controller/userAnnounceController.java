package com.coobby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class userAnnounceController {
	
	@RequestMapping("Announce/Boardlist")
	public String Boardlist() {
		return "/user/Announce/Boardlist";
	}
	
	@RequestMapping("Announce/Boarddetail")
	public String Boarddetail() {
		return "/user/Announce/Boarddetail";
	}
}
