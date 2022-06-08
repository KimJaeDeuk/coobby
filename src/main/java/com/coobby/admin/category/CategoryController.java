package com.coobby.admin.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("admin")
@Controller
public class CategoryController {

	@Autowired
	private CategoryService cateService;
	@RequestMapping("/{step}")
	public String viewPage(@PathVariable String step) {
		return "admin/"+step;
	}
	
	@RequestMapping("/category")
	public void categoryManage(Model m) {
		m.addAttribute("cateList",cateService.getCateList());
	
	}
	
	
}
