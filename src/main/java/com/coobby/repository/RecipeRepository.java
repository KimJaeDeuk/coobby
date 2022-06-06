package com.coobby.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.coobby.vo.RecipeVO;

public interface RecipeRepository extends CrudRepository<RecipeVO, Integer>{
	public List<RecipeVO> findByReCreatetime(String currentDate);
	
//	@Query(value="SELECT   "
//			+ "FROM cook c inner join ingr i  "
//			+ "ON c.ingr_code = i.ingr_code  "
//			+ "WHERE c.re_no = ?1  ",
//			nativeQuery=true)
//	List<Object[]> getingr(int reNo);
}
