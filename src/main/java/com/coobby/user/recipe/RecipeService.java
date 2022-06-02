package com.coobby.user.recipe;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.coobby.vo.CateHowVO;
import com.coobby.vo.CateIngrVO;
import com.coobby.vo.CateKindVO;
import com.coobby.vo.CateSituVO;
import com.coobby.vo.CookVO;
import com.coobby.vo.IngrVO;
import com.coobby.vo.RecipeVO;
import com.coobby.vo.Recipe_imageVO;


public interface RecipeService {
	
	// 레시피 상세보기
	RecipeVO getrecipe(RecipeVO vo);
	
	// 레시피 등록
	void saverecipe(RecipeVO revo, MultipartFile[] file, String[] ingrCount, String[] ingrName);
	
	List<CateHowVO> selectHow();
	
	List<CateKindVO> selectKind();
	
	List<CateSituVO> selectSitu();
	
	List<CateIngrVO> selectIngr();
	
	
}
