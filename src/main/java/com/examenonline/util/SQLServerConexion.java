package com.examenonline.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLServerConexion {

	// http://localhost:8080/RestExamenOnline/rest/

	public static Connection getConexion() {
		Connection con = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:1433;databaseName=BD_ExamenOnline";// variable String que contiene
			String usr = "sa";// usuario
			String psw = "sql";// clave
			con = DriverManager.getConnection(url, usr, psw);// con este método se establece la conexión con el servidor
			
			System.out.println("Conexión OK");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error en el driver de la BD!!");
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.out.println("Error en la conexión con la BD!!");
			e.printStackTrace();
		}
		return con;
	}

	public static void closeConexion(Connection con) {

		try {
			con.close();// Sentencia para cerrar la conexión
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Problemas al cerrar la conexion");
		}

	}

	public static void closeStatement(Statement stmt) {

		try {
			stmt.close();// sentencia para cerrar el statement
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Problemas al cerrar el statement");
		}
	}

	public static void closeCallableStatement(CallableStatement callstm) {

		try {
			callstm.close();// sentencia para cerrar el CallableStatement
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Problemas al cerrar el CallableStatement");
		}
	}
	
	public static void main(String[] args) {
		SQLServerConexion.getConexion();
	}
}
