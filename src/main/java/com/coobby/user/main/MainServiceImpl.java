package com.coobby.user.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coobby.repository.FeedRepository;
import com.coobby.repository.RecipeRepository;

@Service
public class MainServiceImpl implements MainService{
	
	@Autowired
	RecipeRepository recipeRepo;
	
	@Autowired
	FeedRepository feedRepo;
	
	@Override
	public List<Object[]> mainTopRecipeList(){
		return recipeRepo.mainTopRecipeList();
	}

	@Override
	public List<Object[]> mainRecentRecipeList() {
		return recipeRepo.mainRecentRecipeList();
	}

	@Override
	public List<Object[]> mainRandomFeed() {
		return feedRepo.mainRandomFeed();
	}
}
