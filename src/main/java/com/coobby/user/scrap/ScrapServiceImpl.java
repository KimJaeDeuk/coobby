package com.coobby.user.scrap;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coobby.repository.ScrapRepository;
import com.coobby.vo.ScrapVO;

@Service
public class ScrapServiceImpl implements ScrapService {

	@Autowired
	private ScrapRepository scrapRepo;

	//즐겨찾기 목록 
	@Override
	public List<ScrapVO> scrapList() {

		//return scrapRepo.scrapList();
		return null;
	}


	
}
