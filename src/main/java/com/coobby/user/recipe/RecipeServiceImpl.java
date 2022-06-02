package com.coobby.user.recipe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.coobby.repository.CateHowRepository;
import com.coobby.repository.CateIngrRepository;
import com.coobby.repository.CateKindRepository;
import com.coobby.repository.CateSituRepository;
import com.coobby.repository.CookRepository;
import com.coobby.repository.IngrRepository;
import com.coobby.repository.RecipeRepository;
import com.coobby.repository.Recipe_imageRepository;
import com.coobby.vo.CateHowVO;
import com.coobby.vo.CateIngrVO;
import com.coobby.vo.CateKindVO;
import com.coobby.vo.CateSituVO;
import com.coobby.vo.CookVO;
import com.coobby.vo.IngrVO;
import com.coobby.vo.RecipeVO;
import com.coobby.vo.Recipe_imageVO;

@Service
public class RecipeServiceImpl implements RecipeService{
	
	@Autowired 
	private RecipeRepository recipeRepo;
	@Autowired
	private Recipe_imageRepository imageRepo;
	@Autowired
	private CateHowRepository howRepo;
	@Autowired
	private CateKindRepository kindRepo;
	@Autowired
	private CateSituRepository situRepo;
	@Autowired
	private CateIngrRepository ingrRepo;
	@Autowired
	private IngrRepository ingrVORepo;
	@Autowired
	private CookRepository cookRepo;
	
	// 레시피 상세보기
	public RecipeVO getrecipe(RecipeVO revo) {
		return recipeRepo.findById(revo.getReNo()).get();
	}
	
	//레시피 입력
	public void saverecipe(RecipeVO revo, MultipartFile[] file, String[] ingrCount, String[] ingrName) {
		//기본 레시피 정보 저장
		RecipeVO result = recipeRepo.save(revo);
		
		//레시피 사진 저장
		if(file != null) {			
			for(int i = 0; i < file.length; i++) {
				Recipe_imageVO imageVO = new Recipe_imageVO();
				imageVO.setFile(file[i]);
				imageVO.setRecipeVO(result);
				imageVO.setReSeq(i+1);
				imageRepo.save(imageVO);
			}
		}
		//레시피 재료 저장
		for(int i = 0; i < ingrCount.length; i++) {
			CookVO cookVO = new CookVO();
			IngrVO ingrVO = new IngrVO();
			ingrVO.setIngrCode(ingrVORepo.getingr(ingrName[i]));
			cookVO.setIngrCount(ingrCount[i]);
			cookVO.setIngrVO(ingrVO);
			cookVO.setRecipeVO(result);
			cookRepo.save(cookVO);
		}
	}
	
	//방법카테고리 검색
	public List<CateHowVO> selectHow() {
		return (List<CateHowVO>)howRepo.findAll();
	}
	//종류카테고리 검색
	public List<CateKindVO> selectKind() {
		return (List<CateKindVO>)kindRepo.findAll();
	}
	//상황카테고리 검색
	public List<CateSituVO> selectSitu() {
		return (List<CateSituVO>)situRepo.findAll();
	}
	//재료카테고리 검색
	public List<CateIngrVO> selectIngr() {
		return (List<CateIngrVO>)ingrRepo.findAll();
	}
}
