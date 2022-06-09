package com.coobby.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.coobby.vo.MemberVO;

public interface MemberRepository extends CrudRepository<MemberVO,String>{
	
	@Query(value="SELECT mem_id, mem_pass FROM member WHERE mem_id=?1 AND mem_pass=?2", nativeQuery=true)
	public MemberVO checkPass(String memId, String memPass);
	
}
