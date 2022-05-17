package com.coobby.persistence;

import org.springframework.data.repository.CrudRepository;

import com.coobby.domain.FeedVO;

public interface FeedRepository extends CrudRepository<FeedVO, Integer> {

}
