package com.coobby.admin.Announce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AnnounceController {

	@RequestMapping("Announce/insertpage")
	public String insertpage() {
		return "/admin/Announce/insertpage";
	}
	
	@RequestMapping("Announce/listpage")
	public String listpage() {
		return "/admin/Announce/listpage";
	}
	
	@RequestMapping("Announce/detailpage")
	public String detailpage() {
		return "/admin/Announce/detailpage";
	}
}