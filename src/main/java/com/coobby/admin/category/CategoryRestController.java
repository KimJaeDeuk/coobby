package com.coobby.admin.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
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
	public void insertCate(@RequestBody CategoryVO vo) {
		cateService.insertCate(vo);
	}
	
	@PostMapping("/updateCate")
	public void updateCate(@RequestBody CategoryVO vo) {
		cateService.updateCate(vo);
	}
}
