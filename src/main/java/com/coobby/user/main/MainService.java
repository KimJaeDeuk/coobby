package com.coobby.user.main;

import java.util.List;

public interface MainService {

	List<Object[]> mainTopRecipeList();

	List<Object[]> mainRecentRecipeList();

	List<Object[]> mainRandomFeed();

}
