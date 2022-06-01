package com.coobby.admin.dashboard;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coobby.repository.FeedRepository;
import com.coobby.repository.RecipeRepository;

@Service
public class DashBoardServiceImpl implements DashBoardService{

	@Autowired
	private RecipeRepository recipeRepo;
	@Autowired
	private MemberRepository memRepo;
	@Autowired
	private FeedRepository feedRepo;

	private static final String DATE_PATTERN = "yyyy-MM-dd";
	private static final Date today = new Date();
	SimpleDateFormat date = new SimpleDateFormat(DATE_PATTERN);

	@Override
	public int todayRecipe() {			//당일 레시피 등록 개수

		return recipeRepo.findByReCreatetime(date.format(today)).size();
	}

	@Override
	public int todayUser() {			//당일 회원가입 유저 수

		return memRepo.findBymemCreatetime(date.format(today)).size();
	}

	@Override
	public int todayFeed() {			//당일 피드 등록 수
		return feedRepo.findByfeRegdate(date.format(today)).size();
	}

	@Override
	public List<Object[]> ageGroupSexRate() {	//연령대별 회원 성비
		return memRepo.ageGroupSexRate();
	}
//
//	@Override
//	public Object recentFeedCnt() {			//최근한달 동안 일자별 피드 등록수
//		return recipeRepo.recentFeedCnt();
//	}
//
//	@Override
//	public Object recentRecipeCnt() {		//최근 한달동안 레시피 등록 수
//		return null;
//	}

}