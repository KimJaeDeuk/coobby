package com.coobby.admin.dashboard;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashBoardServiceImpl implements DashBoardService{

	@Autowired
	private DashBoardRepository dashRepo;

	private static final String DATE_PATTERN = "yyyy-MM-dd";
	private static final Date today = new Date();
	SimpleDateFormat date = new SimpleDateFormat(DATE_PATTERN);
//	@Override
//	public int recipeCount() {
//		return (int) dashRepo.count();
//	}

	@Override
	public int todayRecipe() {

		return dashRepo.findByReCreatetime(date.format(today)).size();
	}

//	@Override
//	public int todayUser() {
//
//		return dashRepo.findByme
//	}

}
