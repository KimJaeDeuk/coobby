package com.coobby.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.coobby.vo.FeedVO;

public interface FeedRepository extends CrudRepository<FeedVO, Integer> {
	
	List<FeedVO> findByfeRegdate(String format);
	
	@Query(value=" WITH RECURSIVE cte AS "
			+ " ( SELECT DATE_ADD(NOW(), INTERVAL -30 day) AS d "
			+ "   UNION all "
			+ "   SELECT DATE_ADD(d, INTERVAL 1 day)  AS d "
			+ "   FROM cte "
			+ "   WHERE d < NOW()) "
			+ " SELECT "
			+ "   DATE_FORMAT(c.d, '%m-%d') AS day,"
			+ "   IFNULL(m.feCnt,0) feedCount "
			+ " FROM cte c"
			+ "   LEFT OUTER JOIN ("
			+ "      SELECT DATE_FORMAT(fe_regdate, '%m-%d') day, COUNT(fe_no) feCnt "
			+ "      FROM FEED "
			+ "      GROUP BY day "
			+ "      ) m "
			+ "   ON date_format(c.d, '%m-%d') = m.day", nativeQuery=true)
	List<Object[]> recentFeedCnt();
	
	@Query(value=" WITH RECURSIVE cte AS "
			+ " ( SELECT :startDate AS d "
			+ "   UNION all "
			+ "   SELECT DATE_ADD(d, INTERVAL 1 day)  AS d "
			+ "   FROM cte "
			+ "   WHERE d < :endDate) "
			+ " SELECT "
			+ "   DATE_FORMAT(c.d, '%m-%d') AS day,"
			+ "   IFNULL(m.feCnt,0) feedCount "
			+ " FROM cte c"
			+ "   LEFT OUTER JOIN ("
			+ "      SELECT DATE_FORMAT(fe_regdate, '%m-%d') day, COUNT(fe_no) feCnt "
			+ "      FROM FEED "
			+ "      GROUP BY day "
			+ "      ) m "
			+ "   ON date_format(c.d, '%m-%d') = m.day", nativeQuery=true)
	List<Object[]> rangeFeedCnt(@Param("startDate") String startDate, @Param("endDate") String endDate);
}
