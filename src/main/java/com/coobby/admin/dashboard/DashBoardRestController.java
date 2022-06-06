package com.coobby.admin.dashboard;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class DashBoardRestController {
	
	@Autowired
	private DashBoardService dashService;
	
	@GetMapping("ajaxChart")
	public @ResponseBody List<Object[]> ajaxChart(String startDate, String endDate, Model m) {
		System.out.println(startDate + "~" + endDate+"날짜범위");
		List<Object[]> list = dashService.rangeRecipeCnt(startDate, endDate);
		List<Object[]> lists = dashService.rangeFeedCnt(startDate, endDate);
		List<Object[]> result = new ArrayList<Object[]>();
		
		int i =0;
		for(Object[] obj : lists) {
			Object[] objs = new Object[3];
			objs[0] = obj[0];
			objs[1] = obj[1];
			objs[2] = list.get(i)[1];
			result.add(objs);
			i++;
		}
		return result;
		
	} 
}
