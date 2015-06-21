package modelo;

import javax.swing.JOptionPane;

import java.sql.*;


public class InicioSesionDAO {
	private static String rut;
	
	public static int inicioSesion(String usuario, char[]password){
		int resultado = 0;
		String password1 = String.valueOf(password);
		Conexionbd conex = new Conexionbd();
		try{
			Statement st = conex.getConnection().createStatement();
			ResultSet rs = st.executeQuery("select count(*) from empleado where rutE = '"+usuario+"';");
			rs.next();
			resultado = rs.getInt(1);
			if(resultado == 1){
				ResultSet rs1 = st.executeQuery("select count(*) from empleado where rutE = '"+usuario+"' and clave = '"+password1+"';");
				rs1.next();
				resultado = rs1.getInt(1);
				if(resultado == 1){
					ResultSet rs2 = st.executeQuery("select admin,nombreE from empleado where rutE = '"+usuario+"' and clave = '"+password1+"';");
					rs2.next();
					resultado = rs2.getInt(1);
					rut = rs2.getString(2);
					return resultado;
				}else{
					resultado = 3;
					return resultado;
				}
			}
			st.close();
			conex.desconectar();
		}catch(SQLException e){
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al iniciar sesion");
		}
		return resultado;
	}
	
	public static String getRut(){
		return rut;
	}

}
