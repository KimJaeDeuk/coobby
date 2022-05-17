package com.coobby.feed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coobby.domain.FeedVO;
import com.coobby.persistence.FeedRepository;

@Service
public class FeedServiceImpl implements FeedService {
	
	@Autowired
	private FeedRepository feedRepo;
	
	public List<FeedVO> getFeedList(FeedVO vo) {
		return (List<FeedVO>)feedRepo.findAll();
	}
	
	public void insertFeed(FeedVO vo) {
		feedRepo.save(vo);
	}
	

}
