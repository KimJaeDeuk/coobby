package com.coobby.user.recipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coobby.repository.CategoryRepository;
import com.coobby.user.recipe.cook.CookRepository;
import com.coobby.vo.CategoryVO;
import com.coobby.vo.RecipeVO;

@Controller
@RequestMapping("user/recipe")
public class RecipeController {

	@Autowired
	private RecipeService recipeService;
	@Autowired
	private CategoryRepository cateRepo;
	@Autowired
	private RecipeRepository recipeRepo;
	@Autowired
	private CookRepository cookRepo;

	@RequestMapping("recipeinsert")
	public void recipeinsert(Model m) {
		List<CategoryVO> kindresult = new ArrayList<CategoryVO>();
		List<CategoryVO> howresult = new ArrayList<CategoryVO>();
		List<CategoryVO> ingrresult = new ArrayList<CategoryVO>();
		List<CategoryVO> situresult = new ArrayList<CategoryVO>();
		List<Object[]> kind = cateRepo.kindCategory();
		for(Object[] kindobj : kind) {
			CategoryVO vo = new CategoryVO();
			vo.setCateCode((Integer)kindobj[0]);
			vo.setCateName((String)kindobj[1]);
			kindresult.add(vo);
		}
		List<Object[]> how = cateRepo.howCategory();
		for(Object[] howobj : how) {
			CategoryVO vo = new CategoryVO();
			vo.setCateCode((Integer)howobj[0]);
			vo.setCateName((String)howobj[1]);
			howresult.add(vo);
		}
		List<Object[]> ingr = cateRepo.ingrCategory();
		for(Object[] ingrobj : ingr) {
			CategoryVO vo = new CategoryVO();
			vo.setCateCode((Integer)ingrobj[0]);
			vo.setCateName((String)ingrobj[1]);
			ingrresult.add(vo);
		}
		List<Object[]> situ = cateRepo.situCategory();
		for(Object[] situobj : situ) {
			CategoryVO vo = new CategoryVO();
			vo.setCateCode((Integer)situobj[0]);
			vo.setCateName((String)situobj[1]);
			situresult.add(vo);
		}

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
	public String saverecipe(RecipeVO revo) {
		System.out.println("레시피 등록");
		recipeService.saverecipe(revo);
		return "redirect:recipeinsert";
	}


}
