package com.coobby.admin.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coobby.vo.CategoryVO;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("admin")
public class CategoryRestController {
	
	@Autowired
	private CategoryService cateService;
	
	@PostMapping("/insertCate")
	public int insertCate(@RequestBody CategoryVO vo) {
		return cateService.insertCate(vo);
	}
	
	@PutMapping("/updateCate")
	public CategoryVO updateCate(@RequestBody CategoryVO vo) {
		return cateService.updateCate(vo);
	}
	
	@DeleteMapping("/deleteCate/{cateCode}")
	public void deleteCate(@PathVariable Integer cateCode) {
		cateService.deleteCate(cateCode);
	}
}
