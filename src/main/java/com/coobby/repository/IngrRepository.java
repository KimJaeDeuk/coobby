package com.coobby.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.coobby.vo.IngrVO;

public interface IngrRepository extends CrudRepository<IngrVO, Integer> {
//	public IngrVO findByIngrName(String ingrName);
	
	
	@Query(value="SELECT ingr_code "
			+ "FROM ingr  "
			+ "WHERE ingr_name LIKE ?1  ",
			nativeQuery=true)
	int getingr(String ingrName);
}
