package com.coobby.user.feed;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coobby.vo.FeedImageVO;
import com.coobby.vo.FeedVO;

@Service
public class FeedServiceImpl implements FeedService {
	
	@Autowired
	private FeedRepository feedRepo;
	@Autowired
	private FeedImageRepository feedimgrepo;
	 
	private static final String DATE_PATTERN = "yyyy-MM-dd"; 
	private static final Date today = new Date();
	SimpleDateFormat date = new SimpleDateFormat(DATE_PATTERN);
	
	// 피드 목록 출력
	public List<FeedVO> getFeedList(FeedVO vo) {
		return (List<FeedVO>)feedRepo.findAll();
	}
	
	//마이피드 등록
	public void insertFeed(FeedVO vo, FeedImageVO fvo) {
		feedRepo.save(vo);
		
		
//		FeedImageVO imgvo = new FeedImageVO();
//		imgvo.setFeStoredImage(fvo.getFeStoredImage());
//		imgvo.setFeOriginImage(fvo.getFeOriginImage());
		
		feedimgrepo.save(fvo);
	}
	
	// 마이피드 상세보기
	public FeedVO getFeedModal(FeedVO vo) {
		FeedVO fvo = feedRepo.findById(vo.getFeNo()).get();
		feedRepo.save(fvo);
		return fvo;
	}

	// 마이피드 삭제
//	public void deleteFeed(FeedVO vo) {
//		feedimgRepo.queryAnnotation(vo.getFe_no());
//		feedRepo.deleteById(vo.getFe_no());
//	}
	
	// 마이피드 수정
	public FeedVO modifyFeed(FeedVO vo) {
		FeedVO fvo = feedRepo.findById(vo.getFeNo()).get();
		fvo.setFeTitle(vo.getFeTitle());
		fvo.setFeContent(vo.getFeContent());
		fvo = getFeedModal(fvo);
		return feedRepo.save(fvo);

	}

	@Override
	public int todayFeed() {
		return feedRepo.findByfeRegdate(date.format(today)).size();
	}
	
	
}
