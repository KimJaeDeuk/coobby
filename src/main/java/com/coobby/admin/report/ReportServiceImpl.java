package com.coobby.admin.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coobby.vo.ReportVO;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportRepository reportRepo;
	
	@Override
	public List<ReportVO> reportCommentList() {
		
		return null;//(List<ReportVO>) reportRepo.reportCommentList;
	}

	@Override
	public List<ReportVO> reportBoardList() {
		// TODO Auto-generated method stub
		return null;
	}

}
