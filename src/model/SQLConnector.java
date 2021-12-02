package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnector {
	private static String url = "jdbc:mysql://localhost/ql_covid";
	private static String user = "root";
	private static String password = "";
	private static Connection con;
	
	protected SQLConnector() {
	}
	
	protected static Connection getCon() throws SQLException{
		con = DriverManager.getConnection(url, user, password);
		return con;
	}
}
