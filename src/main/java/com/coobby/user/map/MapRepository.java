package com.coobby.user.map;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MapRepository extends CrudRepository<MapVO, Integer> {

	@Query(value="SELECT store_name, latitude, longitude,  "
			+ "	(6371*acos(cos(radians(?1))*cos(radians(latitude))*cos(radians(longitude)  "
			+ "	-radians(?2))+sin(radians(?1))*sin(radians(latitude))))  "
			+ "	AS distance  "
			+ "FROM price  "
			+ "HAVING distance <= 3  "
			+ "ORDER BY distance",
			nativeQuery = true) 
	List<Object[]> getStoreLoc(Double lat, Double lon);

}
