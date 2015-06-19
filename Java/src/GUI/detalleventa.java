package GUI;
import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class detalleventa extends JFrame{

	JLabel id;
	JTextField idpr;
	JButton buscar;
	Panel panel1;
	JTable tabla;
	DefaultTableModel modelo;
	JScrollPane scroll;
	String[] columnas = {"Id producto", "Nombre", "Precio Venta","Id Venta","Rut Cliente","Fecha","Cantidad","Precio total"};
	
	detalleventa(){

		setTitle("Detalle Venta");
		setBounds(0,0,900,436);
		
	    setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		panel1=new Panel();
		panel1.setBounds(10,10,864,377);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
/////////////////////label////////////////////////////////
		
		id=new JLabel("Id detalle");
		id.setBounds(197,11,65,21);
		panel1.add(id);
		
/////////////////////textfield////////////////////////////////
	
		idpr=new JTextField();
		idpr.setBounds(314,11,108,21);
		panel1.add(idpr);
		
/////////////////////button///////////////////////////////
		buscar=new JButton("Buscar");
		buscar.setBounds(481,11,81,22);
		panel1.add(buscar);
		
/////////////////////JTABLE,SCROLL,MODEL///////////////////////////////
	
		modelo = new DefaultTableModel();
		tabla = new JTable(modelo);
		scroll= new JScrollPane(tabla);
		scroll.setBounds(0,56,854,321);
		
		
		for(int i = 0; i < columnas.length; i++){
			modelo.addColumn(columnas[i]);
		}
		
		panel1.add(scroll);
		
	}
	
	
	
	
	public static void main(String[] args){
	detalleventa dv=new detalleventa();
	dv.setVisible(true);
	
}
	
}
