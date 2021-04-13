package it.polito.tdp.anagrammi.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {

		// check user e password
		static private final String jdbcUrl = "jdbc:mysql://localhost/dizionario?user=root&password=root";

		public static Connection getConnection() {

			try {
					Connection connection = DriverManager.getConnection(jdbcUrl);
					return connection;

			} catch (SQLException e) {

				e.printStackTrace();
				throw new RuntimeException("Cannot get a connection " + jdbcUrl, e);
			}
		}	

}
		

