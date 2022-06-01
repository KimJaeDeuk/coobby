package com.coobby.admin.Announce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coobby.user.board.BoardService;

@Controller
@RequestMapping("/admin")
public class adminAnnounceController {

	@Autowired
	BoardService boardService;
	
	@RequestMapping("Announce/insertpage")
	public String insertpage() {
		return "/admin/Announce/insertpage";
	}
	
	@RequestMapping("Announce/listpage")
	public String listpage(Model m) {
		m.addAttribute("boardList",boardService.getBoardList());
		return "/admin/Announce/listpage";
	}
	
	@RequestMapping("Announce/detailpage")
	public String detailpage() {
		return "/admin/Announce/detailpage";
	}
}