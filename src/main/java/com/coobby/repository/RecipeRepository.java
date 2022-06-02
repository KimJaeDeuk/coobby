package com.coobby.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.coobby.vo.RecipeVO;

public interface RecipeRepository extends CrudRepository<RecipeVO, Integer>{
	public List<RecipeVO> findByReCreatetime(String currentDate);
	
	
	@Query(value=" WITH RECURSIVE cte AS "
			+ " ( SELECT DATE_ADD(NOW(), INTERVAL -30 day) AS d "
			+ "   UNION all "
			+ "   SELECT DATE_ADD(d, INTERVAL 1 day)  AS d "
			+ "   FROM cte "
			+ "   WHERE d < NOW() ) "
			+ " SELECT "
			+ "   DATE_FORMAT(c.d, '%m-%d') AS day,"
			+ "   IFNULL(m.reCnt,0) recipeCount "
			+ " FROM cte c"
			+ "   LEFT OUTER JOIN ("
			+ "      SELECT DATE_FORMAT(re_createtime, '%m-%d') day, COUNT(re_no) reCnt "
			+ "      FROM recipe "
			+ "      GROUP BY day "
			+ "      ) m "
			+ "   ON date_format(c.d, '%m-%d') = m.day", nativeQuery=true)
	public List<Object[]> recentRecipeCnt();

	
	@Query(value=" WITH RECURSIVE cte AS "
			+ " ( SELECT :startDate AS d"
			+ "   UNION all"
			+ "   SELECT DATE_ADD(d, INTERVAL 1 day)  AS d"
			+ "   FROM cte "
			+ "   WHERE d < :endDate "
			+ ") "
			+ " SELECT "
			+ "   DATE_FORMAT(c.d, '%m-%d') AS day, "
			+ "   IFNULL(m.recipeCnt,0) recipeCnt "
			+ " FROM cte c "
			+ "   LEFT OUTER JOIN ( "
			+ "      SELECT DATE_FORMAT(re_createtime, '%m-%d') day, count(*) recipeCnt "
			+ "      FROM recipe "
			+ "      GROUP BY day "
			+ "      ) m "
			+ "   ON date_format(c.d, '%m-%d') = m.day", nativeQuery = true)
	public List<Object[]> rangeRecipeCnt(@Param("startDate") String startDate, @Param("endDate") String endDate);
}
