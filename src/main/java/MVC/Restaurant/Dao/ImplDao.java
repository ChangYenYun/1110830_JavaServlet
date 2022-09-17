package MVC.Restaurant.Dao;

import MVC.Restaurant.Model.Consumer;

public interface ImplDao {
	
	/*Create新增*/
	void add(Consumer consumer);
	
	/*Read查詢*/
	String queryAll();//查詢所有。
	
	boolean queryUser(String username,String password);//是否為帳號密碼
	boolean queryRepeat(String username);//是否帳號重複。
	

}
