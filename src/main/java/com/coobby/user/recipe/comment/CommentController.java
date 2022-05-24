package com.coobby.user.recipe.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coobby.vo.Re_commentVO;

@Controller
public class CommentController {
	
	@Autowired CommentService commentService;
	
	@RequestMapping("recomment")
	@ResponseBody
	public void recomment(Re_commentVO revo) {
		commentService.insertComm(revo);
	}
	
}
