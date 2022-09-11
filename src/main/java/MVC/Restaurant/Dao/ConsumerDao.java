package MVC.Restaurant.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import MVC.Restaurant.Model.Consumer;

public class ConsumerDao implements ImplDao {
	
	public static void main(String[] args) {
		Consumer consumer=new Consumer("123","66","1號顧客","091234678","台北");
		new ConsumerDao().add(consumer);
	}

	@Override
	public void add(Consumer consumer) {
		/*jdbc連線_add用法:
		 * 1.先連線 ->取得jdbc連線為:DbConection.getDB()之方法。
		 * 2.撰寫SQL ->insert into
		 * 3.產生SQL執行物件
		 * 4.java語法 ->更新指令
		 * */
		Connection conn=DbConection.getDB();
		String SQL="insert into Consumer(username,password,name,phone,address)values(?,?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1,consumer.getUsername());
			ps.setString(2,consumer.getPassword());
			ps.setString(3,consumer.getName());
			ps.setString(4,consumer.getPhone());
			ps.setString(5,consumer.getAddress());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public String queryAll() {
		/*jdbc連線_query用法:
		 * 1.先連線 ->取得jdbc連線為:DbConection.getDB()之方法。
		 * 2.撰寫SQL ->select..from..
		 * 3.產生SQL執行物件
		 * 4.java語法 ->查詢命令
		 * */
		Connection conn=DbConection.getDB();
		String SQL ="select * from Consumer";
		String show="";
		try {
			PreparedStatement ps =conn.prepareStatement(SQL);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) //next為boolean--->有資料才會撈。
			{
				System.out.println(rs.getString("name"));
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return show;
	}

	@Override
	public boolean queryUser(String username, String password) {
		Connection conn = DbConection.getDB();
		String sql="select * from Consumer where username=? and password=?";
		boolean ans = false;
		try {
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) ans=true;
		
		
		} catch (SQLException e) {
		
			e.printStackTrace();
		}	
		
		return ans;
	}

	@Override
	public boolean queryRepeat(String username) {
		Connection conn=DbConection.getDB();
		String sql="select * from Consumer where username=?";	
		boolean ans=false;
		
		try {
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1, username);
			
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) ans=true;
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return ans;
	}

}
