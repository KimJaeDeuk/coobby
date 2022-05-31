package com.coobby.admin.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coobby.repository.AdminUserRepository;
import com.coobby.vo.MemberVO;

@Service
public class AdminUserServiceImpl implements AdminUserService{

	@Autowired
	private AdminUserRepository adminUserRepo;
	
	@Override
	public List<MemberVO> adminMemberList(MemberVO vo) {
		return null; //(List<MemberVO>)adminUserRepo.findAll();
	}

	
}
