package com.coobby.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.coobby.vo.CookVO;

public interface CookRepository extends CrudRepository<CookVO, Integer>{
	
	@Query(value="SELECT c.ingr_count, i.ingr_name, i.ingr_seasonal, i.ingr_temp, i.ingr_kcal, i.ingr_best, i.ingr_wost, i.ingr_trim, i.ingr_cooking, i.ingr_storage, i.ingr_stored_image  "
			+ "FROM cook c inner join ingr i  "
			+ "ON c.ingr_code = i.ingr_code  "
			+ "WHERE c.re_no = ?1  ",
			nativeQuery=true)
	List<Object[]> getingr(Integer reNo);
}
