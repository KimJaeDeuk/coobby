package com.coobby.admin.category;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.coobby.vo.CateHowVO;


public interface CateHowAdminRepository extends CrudRepository<CateHowVO, Integer>{

	@Query(value="SELECT max(how_code) FROM how_cate", nativeQuery=true)
	int findMaxCode();
	


}
