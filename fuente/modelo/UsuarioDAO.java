package modelo;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class UsuarioDAO {
	public ArrayList <UsuarioVO> consultar(String rut){
		ArrayList <UsuarioVO> empleado = new ArrayList<UsuarioVO>();
		Conexionbd conex = new Conexionbd();
		try{
			PreparedStatement consulta = conex.getConnection().prepareStatement("Select rutE,nombreE,apellidoE,correo,numeroTelefono from empleado where rutE = ?");
			consulta.setString(1, rut);
			ResultSet res = consulta.executeQuery();
			if(res.next()){
				UsuarioVO persona = new UsuarioVO();
				persona.setRut(res.getString("rutE"));
				persona.setNombre(res.getString("nombreE"));
				persona.setApellido(res.getString("apellidoE"));
				empleado.add(persona);
				res.close();
				consulta.close();
				conex.desconectar();
			}
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);
		}
		return empleado;
	}
/*	public ArrayList <UsuarioVO > informacionEmpleado(String rut){
		ArrayList <UsuarioVO> usuario = new ArrayList <UsuarioVO>();
		Conexionbd conex = new Conexionbd();
		try{
			PreparedStatement consulta = conex.getConnection().prepareStatement("Select rutE,nombreE,apellidoE,correo,numeroTelefono from empleado where rutE = ?");
			consulta.setString(1, rut);
			ResultSet rs = consulta.executeQuery();
			while(rs.next()){
				UsuarioVO usuarioVO = new UsuarioVO();
				usuarioVO.setRut(rs.getString("rutE"));
				usuarioVO.setNombre(rs.getString("nombreE"));
				usuarioVO.setApellido(rs.getString("apellidoE"));
				usuarioVO.setCorreo(rs.getString("correo"));
				usuarioVO.setNumeroTelefono(rs.getString("numeroTelefono"));
				System.out.println(rs.getString("nombreE"));
			}
			rs.close();
			conex.desconectar();
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Error de conexion");
		}
		return usuario;
	}*/
}
