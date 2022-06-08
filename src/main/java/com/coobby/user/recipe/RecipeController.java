package com.coobby.user.recipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.coobby.repository.CookRepository;
import com.coobby.repository.RecipeRepository;
import com.coobby.vo.CateHowVO;
import com.coobby.vo.CateIngrVO;
import com.coobby.vo.CateKindVO;
import com.coobby.vo.CateSituVO;
import com.coobby.vo.CookVO;
import com.coobby.vo.IngrVO;
import com.coobby.vo.MemberVO;
import com.coobby.vo.RecipeVO;
import com.coobby.vo.Recipe_imageVO;
import com.coobby.vo.ScrapVO;

@Controller
@RequestMapping("user/recipe")
public class RecipeController {

	@Autowired
	private RecipeService recipeService;
	
	// 재료 상세 데이터 가져오기
	@RequestMapping("ingrModal")
	public void ingrModal(Model m, @RequestParam String ingrName) {
		IngrVO ingrResult = recipeService.selectingr(ingrName);
		m.addAttribute("ingr",ingrResult);
	}
	
	// 레시피 상세보기
	@RequestMapping("recipedetail")
	public void recipedetail(@RequestParam("reNo") int reNo, Model m) {
		// 레시피정보, 작성자정보 가져오기
		RecipeVO recipeResult = recipeService.getrecipe(reNo);
		String reCook = recipeResult.getReCook();
		String reCookArr[] = reCook.split(","); 
		
		List<HashMap> cookResult = new ArrayList<HashMap>();
		List<Object[]> getCook = recipeService.getIngr(reNo);
		for(Object[] result : getCook) {
			HashMap hm = new HashMap();
			hm.put("INGR_COUNT",result[0]);
			hm.put("INGR_NAME",result[1]);
			hm.put("INGR_STORED_IMAGE",result[2]);
			cookResult.add(hm);
		}
		
		List<Recipe_imageVO> imageresult = recipeService.getImage(reNo);
		
		m.addAttribute("ingr", cookResult);
		m.addAttribute("recipe", recipeResult);
		m.addAttribute("cook", reCookArr);
		m.addAttribute("reimage", imageresult);
	}
	
//	@RequestMapping("scrapSave")
//	@ResponseBody
//	public void scrapSave(RecipeVO recipeVO, MemberVO memberVO) {
//		System.out.println(recipeVO.getReNo());
//		System.out.println(memberVO.getMemId());
//		recipeService.scrapSave(recipeVO, memberVO);
//	}
	
//	@RequestMapping("scrapDelete")
//	@ResponseBody
//	public void scrapDelete(ScrapVO scrapVO) {
//		recipeService.scrapDelete(scrapVO);
//	}
	
	
//	@RequestMapping("selectingr")
//	@ResponseBody
//	public IngrVO selectingr(@RequestParam String ingrName) {
//		IngrVO result = recipeService.selectingr(ingrName);
//		return result;
//	}
	
	// 레시피 등록 페이지 이동
	@RequestMapping("recipeinsert")
	public void recipeinsert(Model m) {		
		List<CateHowVO> howresult = recipeService.selectHow();
		List<CateKindVO> kindresult = recipeService.selectKind();
		List<CateIngrVO> ingrresult = recipeService.selectIngr();
		List<CateSituVO> situresult = recipeService.selectSitu();
		
		m.addAttribute("kind", kindresult);
		m.addAttribute("how", howresult);
		m.addAttribute("ingr", ingrresult);
		m.addAttribute("situ", situresult);

	}
	
	// 레시피 등록
	@RequestMapping("recipesave")
	public String saverecipe(HttpServletRequest request, HttpServletResponse response, RecipeVO revo, MultipartFile[] file, @RequestParam("ingrCount") String[] ingrCount, @RequestParam("ingrName") String[] ingrName) {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		recipeService.saverecipe(revo, file, ingrCount, ingrName);
		
		return "redirect:recipeinsert";
	}


}