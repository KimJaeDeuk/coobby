package com.coobby.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.coobby.vo.CateHowVO;
import com.coobby.vo.CateKindVO;


public interface CateKindAdminRepository extends CrudRepository<CateKindVO, Integer>{
	
	@Query(value="SELECT max(kind_code) FROM kind_cate", nativeQuery=true)
	int findMaxCode();
	


}
