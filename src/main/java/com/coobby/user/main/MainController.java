package com.coobby.user.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class MainController {
	
	@Autowired
	MainService mainService;
	
	@RequestMapping("/mainpage")
	public void mainPage(Model m) {
		List<Object[]> list = mainService.mainTopRecipeList();	//탑7 레시피
		m.addAttribute("topRecipe", list);
		m.addAttribute("recentRecipe", mainService.mainRecentRecipeList());
		m.addAttribute("feedList", mainService.mainRandomFeed());
	}
	
}
