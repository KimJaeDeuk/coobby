package com.coobby.admin.dashboard;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.coobby.vo.FeedVO;

public interface FeedRepository extends CrudRepository<FeedVO, Integer>{

	List<FeedVO> findByfeRegdate(String format);

}
