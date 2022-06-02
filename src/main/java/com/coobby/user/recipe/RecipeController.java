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
import org.springframework.web.multipart.MultipartFile;

import com.coobby.repository.CookRepository;
import com.coobby.repository.RecipeRepository;
import com.coobby.vo.CateHowVO;
import com.coobby.vo.CateIngrVO;
import com.coobby.vo.CateKindVO;
import com.coobby.vo.CateSituVO;
import com.coobby.vo.CookVO;
import com.coobby.vo.IngrVO;
import com.coobby.vo.RecipeVO;
import com.coobby.vo.Recipe_imageVO;

@Controller
@RequestMapping("user/recipe")
public class RecipeController {

	@Autowired
	private RecipeService recipeService;
	@Autowired
	private RecipeRepository recipeRepo;
	@Autowired
	private CookRepository cookRepo;

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

	@RequestMapping("recipedetail")
	public void recipedetail(@RequestParam("reNo") Integer reNo, Model m) {
		// 레시피정보, 작성자정보 가져오기
		RecipeVO recipeResult = recipeRepo.findById(reNo).get();
		List<HashMap> cookResult = new ArrayList<HashMap>();
		List<Object[]> getCook = cookRepo.getingr(reNo);
		for(Object[] result : getCook) {
			HashMap hm = new HashMap();
			hm.put("INGR_COUNT",result[0]);
			hm.put("INGR_NAME",result[1]);
			hm.put("INGR_SEASONAL",result[2]);
			hm.put("INGR_TEMP",result[3]);
			hm.put("INGR_KCAL",result[4]);
			hm.put("INGR_BEST",result[5]);
			hm.put("INGR_WOST",result[6]);
			hm.put("INGR_TRIM",result[7]);
			hm.put("INGR_COOKING",result[8]);
			hm.put("INGR_STORAGE",result[9]);
			hm.put("INGR_STORED_IMAGE",result[10]);
			cookResult.add(hm);
		}

		m.addAttribute("ingr", cookResult);
		m.addAttribute("recipe", recipeResult);
	}

	@RequestMapping("recipesave")
	public String saverecipe(HttpServletRequest request, HttpServletResponse response, RecipeVO revo, MultipartFile[] file, @RequestParam("ingrCount") String[] ingrCount, @RequestParam("ingrName") String[] ingrName) {
		System.out.println("레시피 등록");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		for(int i = 0; i<ingrName.length; i++) {
			System.out.println(ingrCount[i]);
			System.out.println(ingrName[i]);
		}
		
		recipeService.saverecipe(revo, file, ingrCount, ingrName);
//		recipeService.saverecipeimage(reim);
		
		return "redirect:recipeinsert";
	}


}