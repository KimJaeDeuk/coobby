package com.coobby.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.coobby.vo.MemberVO;

public interface AdminUserRepository extends CrudRepository<MemberVO, Integer>{

	List<MemberVO> OrderByMemCreatetimeDesc();
	
//	@Query("SELECT b FROM MemberVO b ORDER BY b.memTel DESC")
//	List<MemberVO> queryAnnotation();
	
//	@Query(value="SELECT * FROM member ORDER BY mem_createtime desc", nativeQuery = true)
//	List<MemberVO> queryAnnotation();
	
}
