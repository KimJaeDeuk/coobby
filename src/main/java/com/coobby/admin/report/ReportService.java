package com.coobby.admin.report;

import java.util.List;

import com.coobby.vo.ReportVO;

public interface ReportService {

	public List<ReportVO> reportCommentList();
	public List<ReportVO> reportBoardList();
}
