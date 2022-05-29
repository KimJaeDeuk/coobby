package com.coobby.user.map;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coobby.vo.MapVO;

@Controller
@RequestMapping("/user")
public class MapController {
	
	@Autowired
	private MapService mapService;

	@RequestMapping("map/map")
	public void map(Model m, MapVO vo) {
		/*
		 * List<MapVO> result = mapService.getStoreList(vo);
		 *  m.addAttribute("storeList",result);
		 */
			
	}


}

