package com.coobby.user.scrap;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user/mypage")
public class ScrapController {
	
	@Autowired
	private ScrapService scrapService;

	//즐겨찾기 목록
	@RequestMapping("scrap")
	public String ScrapList(HttpSession session, Model m ) {
		
		
		
		return "user/mypage/MemberFavorites";
		
	}
}
