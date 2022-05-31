package com.coobby.admin.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coobby.vo.MemberVO;

@Controller
@RequestMapping("/admin")
public class AdminUserController {

	@Autowired
	private AdminUserService adminUserService;
	
	@RequestMapping("AdminUser/adminUser")
	public void getAdminUser(Model m) {
		List<MemberVO> list = adminUserService.adminMemberList();
		
		m.addAttribute("memlist", list);
	}
}
