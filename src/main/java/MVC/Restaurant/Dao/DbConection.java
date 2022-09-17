package MVC.Restaurant.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConection {
	
	public static void main(String[] args) {
	    System.out.println(DbConection.getDB());
	}
	
	//建立連線DB方法:將jdbc共通連線方式打包成1個方法。
	public static Connection getDB()
	{
		String url="jdbc:mysql://localhost:3306/Restaurant";
		String user="root";
		String password="******";
		Connection conn =null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); //載入的jar檔(驅動程式)
			conn=DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	
	
}
