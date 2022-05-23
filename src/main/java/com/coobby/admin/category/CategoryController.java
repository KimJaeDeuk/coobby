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
		
		m.addAttribute("kindCate",cateService.kindList());
		m.addAttribute("howCate",cateService.howList());
		m.addAttribute("ingrCate",cateService.ingrList());
		m.addAttribute("situCate",cateService.situList());
	}
	@RequestMapping("/cateSave")
	public String saveCategory(String[] kind_name, String[] how_name, String[] ingr_name, String[] situ_name) {
		cateService.saveCategory(kind_name, how_name, ingr_name, situ_name);
		return "redirect:/admin/category";
	}
}
