package com.coobby.user.recipe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coobby.user.recipe.category.CategoryRepository;
import com.coobby.vo.RecipeVO;

@Controller
@RequestMapping("user/recipe")
public class RecipeController {
	
	@Autowired 
	private RecipeService recipeService; 
	@Autowired
	private CategoryRepository cateRepo;
	
	@RequestMapping("recipeinsert")
	public void recipeinsert(Model m) {
		
		List<Object[]> kind = cateRepo.kindCategory();
		List<Object[]> how = cateRepo.howCategory();
		List<Object[]> ingr = cateRepo.ingrCategory();
		List<Object[]> situ = cateRepo.situCategory();
		
		for(Object[] item : kind) {
			System.out.println(item.toString());
		}
		
		m.addAttribute("kind", kind);
		m.addAttribute("how", how);
		m.addAttribute("ingr", ingr);
		m.addAttribute("situ", situ);
	}
	
	@RequestMapping("recipedetail")
	public void recipedetail(RecipeVO vo, Model m) {
//		RecipeVO result = recipeService.getrecipe(vo);
//		m.addAttribute("recipe", result);
	}
	
	@RequestMapping("recipesave")
	public String saverecipe(RecipeVO revo) {
		System.out.println("레시피 등록");
		recipeService.saverecipe(revo);
		return "redirect:recipeinsert";
	}
	
	
}
