package com.coobby.user.recipe.category;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.coobby.vo.CategoryVO;

public interface CategoryRepository extends CrudRepository<CategoryVO, Integer>{
	
	@Query(value="SELECT cate_code, cate_name from category  "
			+ " WHERE cate_detail_parent_lev = 1 ORDER BY cate_code  ",
			nativeQuery=true)
	List<Object[]> kindCategory();
	
	@Query(value="SELECT cate_code, cate_name from category  "
			+ " WHERE cate_detail_parent_lev = 2 ORDER BY cate_code  ",
			nativeQuery=true)
	List<Object[]> howCategory();
	
	@Query(value="SELECT cate_code, cate_name from category  "
			+ " WHERE cate_detail_parent_lev = 3 ORDER BY cate_code  ",
			nativeQuery=true)
	List<Object[]> ingrCategory();
	
	@Query(value="SELECT cate_code, cate_name from category  "
			+ " WHERE cate_detail_parent_lev = 4 ORDER BY cate_code  ",
			nativeQuery=true)
	List<Object[]> situCategory();
	
}
