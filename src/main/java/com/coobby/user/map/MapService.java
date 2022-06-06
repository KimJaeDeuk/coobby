package com.coobby.user.map;

import java.util.List;

import com.coobby.vo.MapVO;

public interface MapService {
	//오프라인 매장 위치 
	public List<Object[]> getStoreLoc(Double lat, Double lon);
	
	//온라인 매장 및 가격
	public List<MapVO> getStoreList(MapVO vo);
	
	//public List<MapVO> getStoreList(MapVO vo, Pageable page);
}
