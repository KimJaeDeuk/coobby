package com.coobby.admin.category;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.coobby.vo.CateHowVO;
import com.coobby.vo.CateIngrVO;


public interface CateIngrAdminRepository extends CrudRepository<CateIngrVO, Integer>{
	
	@Query(value="SELECT max(Ingr_code) FROM ingr_cate", nativeQuery=true)
	int findMaxCode();

}
