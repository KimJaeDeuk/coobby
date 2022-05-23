package com.coobby.user.feed;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.coobby.vo.FeedImageVO;

public interface FeedImageRepository extends CrudRepository<FeedImageVO, String> {

	
	@Query(value="DELETE FROM feed_image WHERE fe_no=:fe_no", nativeQuery=true)
	List<Object []> queryAnnotation(Integer fe_no);
}
