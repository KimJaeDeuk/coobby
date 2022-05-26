package com.coobby.admin.QnA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class QnAController {

	@RequestMapping("QnA/insertpage")
	public String insertpage() {
		return "/admin/QnA/insertpage";
	}
	
	@RequestMapping("QnA/listpage")
	public String listpage() {
		return "/admin/QnA/listpage";
	}
}
