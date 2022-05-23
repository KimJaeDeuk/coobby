package com.coobby.admin.category;

import java.util.List;

import com.coobby.vo.HowCateVO;
import com.coobby.vo.IngrCateVO;
import com.coobby.vo.KindCateVO;
import com.coobby.vo.SituCateVO;

public interface CategoryService {

	void saveCategory(String[] kind_name, String[] situ_name, String[] ingr_name, String[] how_name);

	List<KindCateVO> kindList();

	List<SituCateVO> situList();
	
	List<IngrCateVO> ingrList();
	
	List<HowCateVO> howList();

}
