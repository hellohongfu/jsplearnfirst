package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.istack.internal.logging.Logger;

import model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.SQLException;

public class UserStore implements IUserStore {

	static Logger logger = Logger.getLogger(UserStore.class.getName(), null);
	
	
	@Override
	public int InsertUser(User user) throws Exception {
		// TODO Auto-generated method stub
		
		String sql ="insert into Users (id,name) values ("+user.Id+",'"+user.Name+"')";
		
		logger.info(sql);
		
		//String sql ="insert into users (id,name) values (2020,'222')";
		
		Connection conn=null;
		String url ="jdbc:mysql://localhost:3306/books?user=root&password=root&useunicode=true&characterEncoding=UTF8";
		
		try	{
			Class.forName("com.mysql.jdbc.Driver");
			conn =DriverManager.getConnection(url);
			Statement state=conn.createStatement();
			boolean rs= state.execute(sql);
			
		}
		catch(SQLException e){
			
			e.printStackTrace();
			
			System.out.println(sql);
		
			
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		finally{
			conn.close();
		}
		
		
		return 0;
	}

	@Override
	public User Retrieve(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> QueryUserByName(String name) throws Exception {
		// TODO Auto-generated method stub

		String sql ="select * from users order by id desc ";
		//String sql ="insert into users (id,name) values (2020,'222')";
		List<User> users=new  ArrayList<User>();
		Connection conn=null;
		String url ="jdbc:mysql://localhost:3306/books?user=root&password=root&useunicode=true&characterEncoding=UTF8";
		
		try	{
			Class.forName("com.mysql.jdbc.Driver");
			conn =DriverManager.getConnection(url);
			Statement state=conn.createStatement();
			ResultSet rs= state.executeQuery(sql);
			
			ResultSetMetaData md = rs.getMetaData();
			int columnCount = md.getColumnCount(); //返回此 ResultSet 对象中的列数   
			Map rowData = new HashMap();
			
			while(rs.next()){
				
				
				
				User u=new User();
				
				u.Id= rs.getInt("id");
				u.Name=rs.getString("name");
				users.add(u);
			}
			
			
		}
		catch(SQLException e){
			
			e.printStackTrace();
			
			System.out.println(sql);
			
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		finally{
			conn.close();
		}
		return users;
	}

	@Override
	public void Delete(int userId) {
		// TODO Auto-generated method stub

	}

}
