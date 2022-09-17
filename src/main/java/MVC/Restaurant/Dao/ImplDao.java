package MVC.Restaurant.Dao;

import MVC.Restaurant.Model.Consumer;

public interface ImplDao {
	
	//Create新增
	void add(Consumer consumer);
	
	//Read查詢
	String queryAll();

}
