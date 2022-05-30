package com.coobby.user.recipe.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coobby.repository.CommentRepository;
import com.coobby.vo.Re_commentVO;

@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentRepository commRepo;
	
	public void insertComm(Re_commentVO revo) {
		commRepo.save(revo);
	}

}
