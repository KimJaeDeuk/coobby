package com.coobby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class MypageController {
	@RequestMapping("mypage/Membersignout")
	public String Membersignout() {
		return "/user/mypage/Membersignout";
	}
	
	@RequestMapping("mypage/Memberupdate")
	public String Memberupdate() {
		return "/user/mypage/Memberupdate";
	}
	
	@RequestMapping("mypage/Memberpasswordcheck")
	public String Memberpasswordcheck() {
		return "/user/mypage/Memberpasswordcheck";
	}
	
	@RequestMapping("mypage/MemberFavorites")
	public String MemberFavorites() {
		return "/user/mypage/MemberFavorites";
	}
	
	@RequestMapping("mypage/inquery")
	public String inquery() {
		return "/user/mypage/inquery";
	}
	
	@RequestMapping("mypage/inqueryinsert")
	public String inqueryinsert() {
		return "/user/mypage/inqueryinsert";
	}
	
	@RequestMapping("mypage/inquerydelete")
	public String inquerydelete() {
		return "/user/mypage/inquerydelete";
	}
	
}
