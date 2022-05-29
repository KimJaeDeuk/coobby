package com.coobby.admin.report;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.coobby.vo.ReportVO;

public interface ReportRepository extends CrudRepository<ReportVO, Integer>{

	/*
	 * @Query(
	 * value="SELECT * FROM report WHERE title LIKE %?1% ORDER BY report DESC",
	 * nativeQuery = true) List<ReportVO> reportCommentList();
	 */
	
}
