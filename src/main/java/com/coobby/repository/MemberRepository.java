package com.coobby.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.coobby.vo.MemberVO;
import com.coobby.vo.RecipeVO;
import com.coobby.vo.MemberVO;

public interface MemberRepository extends CrudRepository<MemberVO, String>{

	List<RecipeVO> findBymemCreatetime(String date);
	
	@Query(value="SELECT CASE "
			+ "		   WHEN age < 20 THEN '10대' "
			+ "        WHEN age < 30 THEN '20대' "
			+ "        WHEN age < 40 THEN '30대' "
			+ "        WHEN age < 50 THEN '40대' "
			+ "        WHEN age < 60 THEN '50대' "
			+ "        WHEN age < 70 THEN '60대' "
			+ " 	   ELSE '70대' "
			+ "       END AS age_group, "
			+ "       ROUND(count(case when mem_sex='0' Then 0 End)/count(mem_sex)*100) as menCount, ROUND(count(case when mem_sex='1' Then 0 End)/count(mem_sex)*100) "
			+ "       as womenCount "
			+ "FROM (SELECT *, FLOOR(date_format(now(), '%Y')-substring(mem_birth,1,4)) age FROM member) a "
			+ "GROUP BY age_group "
			+ "ORDER BY age_group ", nativeQuery=true)
	List<Object[]> ageGroupSexRate();
	
	@Query(value="WITH RECURSIVE cte AS "
			+ " (  SELECT DATE_ADD(NOW(), INTERVAL -7 day) AS d "
			+ "   UNION all "
			+ "   SELECT DATE_ADD(d, INTERVAL 1 day)  AS d "
			+ "   FROM cte "
			+ "   WHERE d < DATE_ADD(NOW(), INTERVAL -1 day) ) "
			+ " SELECT  "
			+ "   DATE_FORMAT(c.d, '%m-%d') AS day, "
			+ "   IFNULL(m.kktmember,0) kktmember, "
			+ "   IFNULL(m.webmember,0) webmember "
			+ "FROM cte c "
			+ "   LEFT OUTER JOIN ( "
			+ "      SELECT DATE_FORMAT(mem_createtime, '%m-%d') day,"
			+ "            (select count(*) from member where mem_kkt=1) kktmember, "
			+ "            (SELECT count(*) from member where mem_kkt=0) webmember "
			+ "      FROM member "
			+ "      GROUP BY day "
			+ "      ) m "
			+ "   ON date_format(c.d, '%m-%d') = m.day", nativeQuery=true)
	List<Object[]> weekKktWebMemberCnt();
}