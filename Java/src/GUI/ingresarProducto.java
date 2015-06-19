package GUI;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class ingresarProducto extends JFrame{

	JLabel nombre,descripcion,preciov,precioc,idproveedor,titulo;
	JTextField nombre1,preciov1,precioc1,idproveedor1;
	JButton ingresar,cancelar;
	Panel panel1;
	JTextArea descripcion1;
	
	
	ingresarProducto(){
		
		setTitle("Ingresar Producto");
		setBounds(0,0,622,418);
	    setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		panel1=new Panel();
		panel1.setBounds(10,10,586,359);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		/////////////////////label///////////////////////////
				
		nombre=new JLabel("Nombre Producto");
		nombre.setBounds(0,83,138,21);
		panel1.add(nombre);
		
		preciov=new JLabel("Precio Venta");
		preciov.setBounds(331,147,95,21);
		panel1.add(preciov);
		
		precioc=new JLabel("Precio Costo");
		precioc.setBounds(0,147,95,21);
		panel1.add(precioc);
		
		idproveedor=new JLabel("Id Proveedor");
		idproveedor.setBounds(331,83,95,21);
		panel1.add(idproveedor);
		
		descripcion=new JLabel("Descripcion");
		descripcion.setBounds(0,210,63,21);
		panel1.add(descripcion);
				
		titulo=new JLabel("Para ingresar un nuevo producto por favor llenar los siguiente datos ");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		titulo.setBounds(28,11,522,28);
		panel1.add(titulo);
		
/////////////////////textfield///////////////////////////
		
		nombre1=new JTextField();
		nombre1.setBounds(127,83,173,21);
		panel1.add(nombre1);
		
		preciov1=new JTextField();
		preciov1.setBounds(426,147,150,21);
		panel1.add(preciov1);
		
		precioc1=new JTextField();
		precioc1.setBounds(127,147,173,21);
		panel1.add(precioc1);
		
		idproveedor1=new JTextField();
		idproveedor1.setBounds(426,83,150,21);
		panel1.add(idproveedor1);
		
		
/////////////////////TextPane///////////////////////////		
		Border border = BorderFactory.createLineBorder(Color.GRAY);
		descripcion1=new JTextArea();
		descripcion1.setBounds(127,210,299,99);
		descripcion1.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		descripcion1.setLineWrap(true);
		panel1.add(descripcion1);
		
		
/////////////////////button///////////////////////////
		
		ingresar=new JButton("Ingresar");
		ingresar.setBounds(138,320,120,28);
		panel1.add(ingresar);
		
		cancelar=new JButton("Cancelar");
		cancelar.setBounds(304,320,120,28);
		panel1.add(cancelar);
	}
	
	public static void main(String [] args){
		ingresarProducto ip=new ingresarProducto();
		ip.setVisible(true);
		
	}
	
}
