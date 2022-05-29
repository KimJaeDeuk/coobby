package com.coobby.admin.dashboard;

import java.util.List;

public interface DashBoardService {

	
	//int recipeCount();

	int todayRecipe();

	int todayUser();

	int todayFeed();

	List<Object[]> ageGroupSexRate();

}
