package com.coobby.admin.dashboard;

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
}
