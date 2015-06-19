package GUI;

import java.awt.Font;
import java.awt.Panel;

import javax.swing.*;

public class crearempleado extends JFrame {


	JLabel rut,nombre,apellido,correo,numero,clave,titulo;
	JTextField rut1,nombre1,apellido1,correo1,numero1,clave1;
	JButton registrar,cancelar;
	Panel panel1;
	
	crearempleado(){
	
		setTitle("Registrar Cliente");
		setBounds(0,0,622,418);
		
	    setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		panel1=new Panel();
		panel1.setBounds(10,10,586,359);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
/////////////////////label////////////////////////////////

		rut=new JLabel("Rut");
		rut.setBounds(10,96,54,23);
		panel1.add(rut);
		
		nombre=new JLabel("Nombre");
		nombre.setBounds(10,147,54,23);
		panel1.add(nombre);
		
		apellido=new JLabel("Apellido");
		apellido.setBounds(10,198,54,23);
		panel1.add(apellido);
		
		numero=new JLabel("Numero Telefonico");
		numero.setBounds(265,96,107,23);
		panel1.add(numero);
		
		correo =new JLabel("Correo Electronico");
		correo.setBounds(265,149,107,19);
		panel1.add(correo);
		
		clave=new JLabel("Clave");
		clave.setBounds(265,200,99,18);
		panel1.add(clave);
		
		titulo=new JLabel("Para registrar a un empleado por favor llenar los siguientes datos");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		titulo.setBounds(57,11,496,29);
		panel1.add(titulo);
		
/////////////////////TextField////////////////////////////////
		
		rut1=new JTextField();
		rut1.setBounds(70,96,165,21);
		panel1.add(rut1);
		
		nombre1=new JTextField();
		nombre1.setBounds(70,147,165,21);
		panel1.add(nombre1);
		
		apellido1=new JTextField();
		apellido1.setBounds(70,198,165,21);
		panel1.add(apellido1);
		
		numero1=new JTextField();
		numero1.setBounds(389,96,164,21);
		panel1.add(numero1);
		
		correo1=new JTextField();
		correo1.setBounds(389,147,164,21);
		panel1.add(correo1);
		
		clave1=new JTextField();
		clave1.setBounds(391,198,162,21);
		panel1.add(clave1);
		
/////////////////////Button////////////////////////////////
	
		registrar=new JButton("Registrar");
		registrar.setBounds(134,288,123,29);
		panel1.add(registrar);
		
		cancelar=new JButton("Cancelar");
		cancelar.setBounds(310,288,123,29);
		panel1.add(cancelar);
	}

	
	
	public static void main(String[] args){
		crearempleado ce=new crearempleado();
		ce.setVisible(true);
		
	}
	
}
