package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnector {
	private String url = "jdbc:mysql://localhost/ql_covid";
	private String user = "root";
	private String password = "";
	private Connection con;
	
	public SQLConnector() {
	}
	
	public Connection getCon() throws SQLException{
		con = DriverManager.getConnection(url, user, password);
		return con;
	}
}
