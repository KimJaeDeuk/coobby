package com.coobby.user.feed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coobby.vo.FeedVO;

@Service
public class FeedServiceImpl implements FeedService {
	
	@Autowired
	private FeedRepository feedRepo;
	@Autowired
	private FeedImageRepository feedimgRepo;
	 
	// 피드 목록 출력
	public List<FeedVO> getFeedList(FeedVO vo) {
		return (List<FeedVO>)feedRepo.findAll();
	}
	
	//마이피드 등록
	public void insertFeed(FeedVO vo) {
		feedRepo.save(vo);
	}
	
	// 마이피드 상세보기
	public FeedVO getFeedModal(FeedVO vo) {
		FeedVO fvo = feedRepo.findById(vo.getFe_no()).get();
		feedRepo.save(fvo);
		return fvo;
	}

	// 마이피드 삭제
	public void deleteFeed(FeedVO vo) {
		feedimgRepo.queryAnnotation(vo.getFe_no());
		feedRepo.deleteById(vo.getFe_no());
	}
	
	// 마이피드 수정
	public FeedVO modifyFeed(FeedVO vo) {
		FeedVO fvo = feedRepo.findById(vo.getFe_no()).get();
		fvo.setFe_title(vo.getFe_title());
		fvo.setFe_content(vo.getFe_content());
		fvo = getFeedModal(fvo);
		return feedRepo.save(fvo);

	}
	

	
	
}
