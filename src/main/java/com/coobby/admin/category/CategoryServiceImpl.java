package com.coobby.admin.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coobby.vo.CategoryVO;

 
@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryRepository cateRepo;

	@Override
	public List<CategoryVO> getCateList() {
		return (List<CategoryVO>) cateRepo.findAll();
	}

	@Override
	public void insertCate(CategoryVO vo) {
		cateRepo.insertCate(vo.getCateName(), vo.getCateDetailParentlev()); 
	}

	@Override
	public void updateCate(CategoryVO vo) {
		cateRepo.updateCate(vo.getCateName());
		
	}
	
	

}
