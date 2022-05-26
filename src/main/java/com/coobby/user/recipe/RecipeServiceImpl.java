package com.coobby.user.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coobby.vo.RecipeVO;

@Service
public class RecipeServiceImpl implements RecipeService{
	
	@Autowired private RecipeRepository recipeRepo;
	
	public RecipeVO getrecipe(RecipeVO revo) {
		return recipeRepo.findById(revo.getReNo()).get();
	}
	
	public void saverecipe(RecipeVO revo) {
		recipeRepo.save(revo);
	}
}
