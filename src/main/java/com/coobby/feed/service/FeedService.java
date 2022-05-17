package com.coobby.feed.service;

import java.util.List;

import com.coobby.domain.FeedVO;


public interface FeedService {
	
	// 글 목록
	List<FeedVO> getFeedList(FeedVO vo);
	
	// 글 등록
	public void insertFeed(FeedVO vo);

}
