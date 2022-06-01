package com.coobby.admin.Announce;

import org.springframework.data.repository.CrudRepository;

import com.coobby.vo.BoardVO;

public interface AnnounceRepository extends CrudRepository<BoardVO, Integer>{
	
	
}
