package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountService{
	
	public static boolean checkAccount(String accountName, String pass) {
		Connection connection = ConnectDB.getconnection();
		String sql = "Select * from Account where Username = ?";
			try {
				PreparedStatement statement = connection.prepareStatement(sql);
				statement.setString(1, accountName);
				ResultSet rs = statement.executeQuery();
				while(rs.next()) {
					if(accountName.equals(rs.getString("Username")) && pass.equals( rs.getString("Password"))) {
					return true;
					}
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
		}

}
