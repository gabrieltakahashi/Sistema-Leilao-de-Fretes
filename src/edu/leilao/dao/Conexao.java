package edu.leilao.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static Conexao instancia;
	private Connection connection;

	private Conexao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/leilao";
			String user = "root";
			String pass = "root";
			connection = DriverManager.getConnection(url, user, pass);
			System.out.println("Conexão realizada");
		} catch (SQLException e) {
			System.out.println("SQLException");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static Conexao getInstancia() {
		if (instancia == null) {
			instancia = new Conexao();
		}
		return instancia;
	}

	public Connection getConnection() {
		return connection;
	}
}
