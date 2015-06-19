package GUI;

import java.awt.Panel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class detallecaja extends JFrame {

	JLabel id;
	JTextField id1;
	JButton buscar;
	Panel panel1;
	JTable tabla;
	DefaultTableModel modelo;
	JScrollPane scroll;
	String[] columnas = {"Id Venta", "Total Venta ", "Fecha Venta"};
	
	detallecaja(){
		
		setTitle("Realizar Venta");
		setBounds(0,0,622,418);		
	    setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		panel1=new Panel();
		panel1.setBounds(10,10,586,359);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
/////////////////////label////////////////////////////////
		
		id=new JLabel("ID Caja");
		id.setBounds(152,11,64,21);
		panel1.add(id);
		
/////////////////////textfield////////////////////////////////

		id1=new JTextField();
		id1.setBounds(243,11,101,21);
		panel1.add(id1);
		
/////////////////////button////////////////////////////////

		buscar=new JButton("Buscar");
		buscar.setBounds(392,10,78,22);
		panel1.add(buscar);
		
/////////////////////table,modelo,scroll///////////////////////////////
		
		modelo = new DefaultTableModel();
		tabla = new JTable(modelo);
		scroll= new JScrollPane(tabla);
		scroll.setBounds(10,55,566,293);		
		for(int i = 0; i < columnas.length; i++){
			modelo.addColumn(columnas[i]);
		}
		panel1.add(scroll);
		
		
		
	}
	
	public static void main(String[] args){
		detallecaja dc=new detallecaja();
		dc.setVisible(true);
		
	}
	
}
