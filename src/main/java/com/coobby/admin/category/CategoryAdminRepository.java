package com.coobby.admin.category;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.coobby.vo.CategoryVO;


public interface CategoryAdminRepository extends CrudRepository<CategoryVO, Integer>{
	
	@Transactional
	@Modifying
	@Query(value="INSERT INTO CATEGORY(cate_lev, cate_Name, cate_parent_lev, cate_detail_parent_lev) "
			+ " values(2, :name ,1, :lev)", nativeQuery=true)
	public void insertCate(@Param("name") String cateName, @Param("lev") int cateDetailParentlev);
	
	@Query(value="SELECT max(cate_code) as cateCode FROM CATEGORY", nativeQuery=true)
	public int findMaxSmallCate();

}
