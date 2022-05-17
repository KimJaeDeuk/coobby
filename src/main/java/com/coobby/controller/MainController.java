package com.coobby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "recipedetail";
	}
	
	// 마이피드 임시로 열기위해
	@RequestMapping("MyFeed")
	public String MyFeed() {
		return "MyFeed";
	}
	
	// 피드 모달창
	@RequestMapping("feed/MyFeedModal")
	public String MyFeedModal() {
		return "feed/MyFeedModal";
	}
	
	// 마이피드 수정
	@RequestMapping("feed/UpdateMyFeed")
	public String UpdateMyFeed() {
		return "feed/UpdateMyFeed";
	}
	
	// 피드 작성페이지
	@RequestMapping("feed/WriteFeed")
	public String WriteFeed() {
		return "feed/WriteFeed";
	}
}
