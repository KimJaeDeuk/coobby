package com.coobby.admin.category;

import java.util.List;

import com.coobby.vo.CategoryVO;

public interface CategoryService {

	List<CategoryVO> getCateList();

	void insertCate(CategoryVO vo);

	void updateCate(CategoryVO vo);


}
