package com.coobby.admin.category;

import java.util.List;

import com.coobby.vo.CategoryVO;

public interface CategoryService {

	List<CategoryVO> getCateList();

	int insertCate(CategoryVO vo);

	CategoryVO updateCate(CategoryVO vo);

	void deleteCate(Integer cateCode);


}
