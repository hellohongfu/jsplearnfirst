package dao;

import java.sql.SQLException;
import java.util.List;

import model.User;

public interface IUserStore {

	
	int InsertUser( User user) throws Exception;
	
	User Retrieve(int userId);
	
	List<User> QueryUserByName(String name) throws Exception;
	
	void Delete(int userId);
}
