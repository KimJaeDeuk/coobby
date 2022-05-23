package com.coobby.admin.dashboard;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.coobby.vo.RecipeVO;

public interface DashBoardRepository extends CrudRepository<RecipeVO, Integer>{
	public List<RecipeVO> findByReCreatetime(String currentDate);
}
