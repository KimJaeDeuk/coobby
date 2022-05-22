package com.coobby.user.feed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coobby.vo.FeedVO;

@Controller
@RequestMapping("/user/feed")
public class FeedController {
	
	@Autowired
	private FeedService feedService;
	
		// 마이피드 목록 출력
		@RequestMapping("/MyFeed")
		public void getFeedList(Model m) {
			FeedVO vo = new FeedVO();
			List<FeedVO> list = feedService.getFeedList(vo);
			
			m.addAttribute("feedList",list);
		}

		// 마이피드 상세보기
		@RequestMapping("/MyFeedModal")
		public void MyFeedModal(FeedVO vo, Model m) {
			m.addAttribute("myfeedmodal", feedService.getFeedModal(vo));
		}
		
		
		@RequestMapping("/insertFeed")
		public void insertFeed() {
			
		}
		

		// 피드 작성페이지
		@RequestMapping("/saveFeed")
		public String saveFeed(FeedVO vo) {
			System.out.println(vo.getFe_replycheck());
			feedService.insertFeed(vo);
			return "redirect:MyFeed";
		}
		
		// 마이피드 삭제
		@RequestMapping("/deleteFeed")
		public String deleteFeed(FeedVO vo) {
			feedService.deleteFeed(vo);
			return "redirect:MyFeed";
		}
		
		// 마이피드 수정 페이지의 원본 상세보기
//		@RequestMapping("/UpdateMyFeed")
//		public void getUpdateFeed(FeedVO vo, Model m) {
//			m.addAttribute("updatefeed",feedService.getupdateFeed(vo));
//			
//		}
		
		
//		// 마이피드 수정하고 수정된 값 DB에 저장
		@RequestMapping(value="/modifyModal", produces = "application/text;charset=utf-8")
		@ResponseBody
		public String modifyModal(FeedVO vo) {
			FeedVO result = feedService.modifyFeed(vo);
			if(result!=null) return "yes";
			return "no";
			
		}
		 
		
		
		
		
		
//		public String UpdateMyFeed(FeedVO vo, Model m) {
//			FeedVO fvo=feedService.UpdateMyFeed(vo);
//			System.out.println(fvo.toString());
//			m.addAttribute("myfeedmodal", fvo);
//			return "user/feed/MyFeedModal?fe_no="+fvo.getFe_no().toString();
//		}
		
	// ------------------------- 메인피드
		// 마이피드 목록 출력
		@RequestMapping("/MainFeed")
		public void getMainFeedList(Model m) {
			FeedVO vo = new FeedVO();
			List<FeedVO> list = feedService.getFeedList(vo);
			
			m.addAttribute("feedList",list);
		}
		
		// 메인피드 상세보기
		@RequestMapping("/MainFeedModal")
		public void MainFeedModal(FeedVO vo, Model m) {
			m.addAttribute("feedmodal", feedService.getFeedModal(vo));
		}
		
		

}
