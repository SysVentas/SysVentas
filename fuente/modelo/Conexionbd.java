package modelo;

import java.sql.*;

public class Conexionbd {
	static String db = "sysventas";
	static String user  = "root";
	static String pass = "";
	static String url = "jdbc:mysql://localhost/"+db;
	
	Connection conex = null;
	
	public Conexionbd(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conex = DriverManager.getConnection(url,user,pass);
			if(conex != null){
				System.out.println("Conexion realizada con exito a "+db);
				}
		}catch(SQLException e){
			System.out.println(e);
		}catch(ClassNotFoundException e){
			System.out.println(e);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public Connection getConnection(){
		return conex;
	}
	
	public void desconectar(){
		conex = null;
	}
}
