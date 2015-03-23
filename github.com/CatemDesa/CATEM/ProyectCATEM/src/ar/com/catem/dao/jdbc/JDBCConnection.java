package ar.com.catem.dao.jdbc;

import java.sql.*;

public class JDBCConnection {

	
	public static Connection getConnection(){
		
		Connection connection = null;
		try {
			 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "BDCATEM","CATEMPASS");
			System.out.println("conexion establecida");
		} catch (ClassNotFoundException e) {
 
			System.out.println("Error al conectar con la BD");
			e.printStackTrace();
			return null;
 
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al conectar con la BD");
			return null;
		}
		return connection;
		
	}
	
	/*public static void main(String[] args){
		
		Connection connection = null;
		try {
			 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "FOTOMASTER","FOTOMASTER");
			System.out.println("conexion establecida");
		} catch (ClassNotFoundException e) { 
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
}
