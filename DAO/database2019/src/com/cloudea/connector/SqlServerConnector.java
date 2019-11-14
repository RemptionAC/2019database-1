package com.cloudea.connector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlServerConnector implements Connector {
	
	private String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=2019database;user=lx;password=110898";
	public SqlServerConnector() {}
	
	@Override
	public Connection connect() {
		try {
			return DriverManager.getConnection(url);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
