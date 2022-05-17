package com.coobby.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coobby.domain.FeedVO;
import com.coobby.feed.service.FeedService;

@Controller
public class MainController {
	
	@Autowired
	private FeedService feedService;

	@RequestMapping("index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "recipedetail";
	}
	
	//************************************** 피드 부분
	
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
	
	// 피드 목록 출력
	@RequestMapping("/getFeedList")
	public void getFeedList(Model m) {
		FeedVO vo = new FeedVO();
		List<FeedVO> list = feedService.getFeedList(vo);
		m.addAttribute("feedList",list);
	}
	
}








