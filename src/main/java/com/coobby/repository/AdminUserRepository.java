package com.coobby.repository;

import org.springframework.data.repository.CrudRepository;

import com.coobby.vo.MemberVO;

public interface AdminUserRepository extends CrudRepository<MemberVO, Integer>{

	
}
