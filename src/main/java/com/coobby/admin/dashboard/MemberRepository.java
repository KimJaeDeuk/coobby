package com.coobby.admin.dashboard;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.coobby.vo.MemberVO;
import com.coobby.vo.RecipeVO;
import com.coobby.vo.MemberVO;

public interface MemberRepository extends CrudRepository<MemberVO, String>{

	List<RecipeVO> findBymemCreatetime(String date);

}
