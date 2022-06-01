package com.coobby.user.QnA;

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
	
	@RequestMapping("QnA/nav-announce")
	public String BoardList_2() {
	return "/user/QnA/nav-announce";
	}
	
}
 