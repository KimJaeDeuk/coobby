package com.coobby.user.feed;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.coobby.vo.FeedVO;

public interface FeedRepository extends CrudRepository<FeedVO, Integer> {

}
