package com.coobby.admin.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coobby.vo.CategoryVO;

 
@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CateHowAdminRepository cateRepo;

	@Override
	public List<CategoryVO> getCateList() {
		return (List<CategoryVO>) cateRepo.findAll();
	}

	@Override
	public int insertCate(CategoryVO vo) {
		cateRepo.insertCate(vo.getCateName(), vo.getCateDetailParentlev());
		return cateRepo.findMaxSmallCate();
	}

	@Override
	public CategoryVO updateCate(CategoryVO vo) {
		CategoryVO vos = cateRepo.findById(vo.getCateCode()).get();
		vos.setCateName(vo.getCateName());
		cateRepo.save(vos);
		return vos;
	}

	@Override
	public void deleteCate(Integer cateCode) {
		cateRepo.deleteById(cateCode);	
	}
	
	

}
