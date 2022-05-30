package com.coobby.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.coobby.vo.CategoryVO;


public interface CategoryRepository extends CrudRepository<CategoryVO, Integer>{

	// admin
	@Transactional
	@Modifying
	@Query(value="INSERT INTO CATEGORY(cate_lev, cate_Name, cate_parent_lev, cate_detail_parent_lev) "
			+ " values(2, :name ,1, :lev)", nativeQuery=true)
	public void insertCate(@Param("name") String cateName, @Param("lev") int cateDetailParentlev);

	public CategoryVO findByCateName(String cateName);

	// user
	// 종류별 카테고리 검색
	@Query(value="SELECT cate_code, cate_name from category  "
			+ " WHERE cate_detail_parent_lev = 1 ORDER BY cate_code  ",
			nativeQuery=true)
	List<Object[]> kindCategory();

	// 방법별 카테고리 검색
	@Query(value="SELECT cate_code, cate_name from category  "
			+ " WHERE cate_detail_parent_lev = 2 ORDER BY cate_code  ",
			nativeQuery=true)
	List<Object[]> howCategory();

	// 재료별 카테고리 검색
	@Query(value="SELECT cate_code, cate_name from category  "
			+ " WHERE cate_detail_parent_lev = 3 ORDER BY cate_code  ",
			nativeQuery=true)
	List<Object[]> ingrCategory();

	// 상황별 카테고리 검색
	@Query(value="SELECT cate_code, cate_name from category  "
			+ " WHERE cate_detail_parent_lev = 4 ORDER BY cate_code  ",
			nativeQuery=true)
	List<Object[]> situCategory();

}
