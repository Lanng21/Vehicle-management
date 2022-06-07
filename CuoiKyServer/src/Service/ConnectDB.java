package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	public static Connection getconnection() {
		Connection conn = null;
		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=QLDKXE;user=sa;password=mailan0202";
			conn = DriverManager.getConnection(dbURL);
			if (conn != null) {
				System.out.println("Connect");
			}
		} catch (SQLException | ClassNotFoundException ex) {
			System.err.println("Cannot connect database, " + ex);
		}
		return conn;
	}
}
