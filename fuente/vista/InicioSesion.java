package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import modelo.*;

public class InicioSesion extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JButton ingresar, salir;
	JLabel usuarioJL, passwordJL;
	JTextField usuarioJT;
	JPasswordField passwordJP;
	InicioSesionDAO InicioSesionDAO;
	UsuarioDAO UsuarioDAO;
	UsuarioVO UsuarioVO;
	
	public InicioSesion(){
		setTitle("SysVentas - Inicio Sesion");
		setBounds(0,0,400,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0,0,400,500);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel imgLogo = new JLabel("");
		imgLogo.setIcon(new ImageIcon("D:\\Workspace\\Eclipse\\SysVentas\\fuente\\vista\\img\\logo.png"));
		imgLogo.setBounds(70, 50, 250, 180);
		panel.add(imgLogo);
		
		usuarioJL = new JLabel("Usuario :");
		usuarioJL.setBounds(85, 260, 100, 30);
		panel.add(usuarioJL);
		
		passwordJL = new JLabel("Contraseña :");
		passwordJL.setBounds(85, 300, 100, 30);
		panel.add(passwordJL);
		
		usuarioJT = new JTextField();
		usuarioJT.setBounds(170, 265, 130, 21);
		panel.add(usuarioJT);
		
		passwordJP = new JPasswordField();
		passwordJP.setBounds(170, 305, 130, 21);
		panel.add(passwordJP);
		
		ingresar = new JButton("Ingresar");
		ingresar.setBounds(85,370,100,25);
		ingresar.addActionListener(new opcion());
		panel.add(ingresar);
		
		salir = new JButton("Salir");
		salir.setBounds(200,370,100,25);
		salir.addActionListener(new opcion());
		panel.add(salir);
		
		setVisible(true);
	}
	/*  0 = no existe usuario
	 *  1 = existe
	 *  2 = password ok
	 *  3 = password mala
	 *  50 = empleado
	 *  51 = administrador
	 *  52 = 
	 */
	public class opcion implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String usuario,respuesta2,nombre,apellido;
			int respuesta;
			char[] password; 
			if(e.getSource() == ingresar){
				usuario = usuarioJT.getText();
		      	password = passwordJP.getPassword();
		      	respuesta = modelo.InicioSesionDAO.inicioSesion(usuario,password);
		      	if(respuesta == 0){
		      		System.out.println("No existe usuario");
		      	}else if(respuesta == 3){
		      		System.out.println("Password mala");
		      	}else if(respuesta == 50){
		      		System.out.println("Bienvenido admin");
		      	}else if(respuesta == 51){
		      		System.out.println("Bienvenido empleado");
		      		SesionEmpleado empleado = new SesionEmpleado();
		      		UsuarioDAO = new UsuarioDAO();
		      		UsuarioVO usuariovo;
		      		ArrayList <UsuarioVO> persona = UsuarioDAO.consultar(usuario);
		      		usuariovo = persona.get(0);
		      		empleado.nombre(usuariovo.getNombre(),usuariovo.getApellido());
		      		//respuesta2 = modelo.InicioSesionDAO.getRut();
		      		//System.out.println(respuesta2);
		      		/*UsuarioDAO = new UsuarioDAO();
		      		UsuarioDAO.informacionEmpleado(usuario);
		      		UsuarioVO = new UsuarioVO();
		      		apellido = UsuarioVO.getApellido();
		      		nombre = UsuarioVO.getNombre();
		      		System.out.println(nombre);
		      		System.out.println(apellido);*/
		      	}else{
		      		System.out.println("Bienvenido bodega");
		      	}
			}else if(e.getSource() == salir){
				System.exit(0);
			}
		}
		
	}
}
