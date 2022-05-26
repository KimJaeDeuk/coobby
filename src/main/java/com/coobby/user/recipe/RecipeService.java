package com.coobby.user.recipe;

import java.util.List;

import com.coobby.vo.RecipeVO;


public interface RecipeService {
	
	// 레시피 상세보기
	public RecipeVO getrecipe(RecipeVO vo);
	
	// 레시피 등록
	public void saverecipe(RecipeVO revo);
}
