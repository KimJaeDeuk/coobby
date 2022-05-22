package com.coobby.user.feed;

import java.util.List;

import com.coobby.vo.FeedVO;


public interface FeedService {
	
	// 마이피드 목록
	List<FeedVO> getFeedList(FeedVO vo);
	
	// 마이피드 상세보기
	public FeedVO getFeedModal(FeedVO vo);
	
	// 마이피드 등록
	public void insertFeed(FeedVO vo);
	
	// 마이피드 삭제
	public void deleteFeed(FeedVO vo);
	
	// 마이피드 수정
	public FeedVO modifyFeed(FeedVO vo);
	
	// 마이피드 이미지 삭제
//	public void deleteFeedImage(FeedImageVO imgvo);
	
	
	// 마이피드 수정 페이지 원본
//	public FeedVO getupdateFeed(FeedVO vo);
	
	// 마이피드 수정
//	public FeedVO UpdateMyFeed(FeedVO vo);
	
	
	

}
