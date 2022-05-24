package com.coobby.user.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapRestController {
@Autowired
private MapService mapService;
	
//페이지 뜨자마자 현재 위치 좌표 받아서 나오는 
@RequestMapping("/mapLoc")
public List<MapVO> getStoreLoc(Double lat, Double lon){
	List<Object[]>locList = mapService.getStoreLoc(lat, lon);
	List<MapVO> resultData = new ArrayList<MapVO>();
	for(Object[] obj : locList) {
		MapVO vo = new MapVO();
		vo.setStoreName((String)obj[0]);
		vo.setLatitude((double)obj[1]);
		vo.setLongitude((double)obj[2]);
		resultData.add(vo);
		
	}
	
	System.out.println("getStoreLoc");
	System.out.println( "lat" + lat +"/" + "lon" + lon);
	
	
	return resultData;
	
}


}
