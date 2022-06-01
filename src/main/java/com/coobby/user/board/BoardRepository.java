package com.coobby.user.board;


import org.springframework.data.repository.CrudRepository;

import com.coobby.vo.BoardVO;

public interface BoardRepository extends CrudRepository<BoardVO, Integer>{
	
	
}
