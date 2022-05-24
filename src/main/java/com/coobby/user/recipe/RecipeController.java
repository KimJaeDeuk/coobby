package com.coobby.user.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coobby.vo.RecipeVO;

@Controller
@RequestMapping("user/recipe")
public class RecipeController {
	
	@Autowired private RecipeService recipeService; 
	
	@RequestMapping("recipeinsert")
	public void recipeinsert() {
	}
	
	@RequestMapping("recipedetail")
	public void recipedetail(RecipeVO vo, Model m) {
//		RecipeVO result = recipeService.getrecipe(vo);
//		m.addAttribute("recipe", result);
	}
	
	
}
