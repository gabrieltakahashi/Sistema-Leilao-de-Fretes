package edu.leilao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static ConnectionFactory instancia;
	private Connection connection;

	private ConnectionFactory() {
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://127.0.0.1:3306/leilao";
			String user = "root";
			String pass = "root";

			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, pass);
			System.out.println("Conexão realizada");
		} catch (SQLException e) {
			System.out.println("SQL Exception");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found Exception");
			e.printStackTrace();
		}

	}

	public static ConnectionFactory getInstancia() {
		if (instancia == null) {
			instancia = new ConnectionFactory();
		}
		return instancia;
	}

	public Connection getConnection() {
		return connection;
	}
}
