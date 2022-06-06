package com.coobby.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.coobby.vo.FeedVO;

public interface FeedRepository extends CrudRepository<FeedVO, Integer> {
	List<FeedVO> findByfeRegdate(String format);

	@Query(value="select *  "
			+ "from feed f join feed_image fi  "
			+ "	on f.fe_no = fi.fe_no "
			+ "where f.fe_no = :fe_no "
			+ "order by fe_seq ", nativeQuery = true)
	List<Object[]> detailFeed(@Param(value = "fe_no") Integer feNo);
	
}
