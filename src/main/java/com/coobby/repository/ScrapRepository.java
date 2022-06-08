package com.coobby.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.coobby.vo.ScrapVO;

public interface ScrapRepository extends CrudRepository<ScrapVO,Integer>{
	
	//즐겨찾기 목록
	@Query(value="",
			nativeQuery = true) 
	List<HashMap> scrapList();
	
}
