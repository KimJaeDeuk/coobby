package com.coobby.user.map;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapServiceImpl implements MapService{
@Autowired
private MapRepository mapRepo;
	@Override
	public List<Object[]> getStoreLoc(Double lat, Double lon) {
				
	return (List<Object[]>)mapRepo.getStoreLoc(lat, lon);
	}

}
