package com.coobby.admin.dashboard;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.coobby.vo.RecipeVO;

public interface RecipeRepository extends CrudRepository<RecipeVO, Integer>{
	public List<RecipeVO> findByReCreatetime(String currentDate);

}
