package GUI;

import java.awt.Panel;

import javax.swing.*;

public class Venta extends JFrame {

	JLabel rut,id,fecha,idpr;
	JTextField rut1,id1,fecha1,idpr1;
	JButton venta,cancelar;
	Panel panel1;
	Venta(){
		
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
		rut=new JLabel("Rut Cliente");
		rut.setBounds(0,91,74,21);
		panel1.add(rut);
		
		id=new JLabel("Id caja");
		id.setBounds(297,91,64,21);
		panel1.add(id);
		
		fecha=new JLabel("Fecha	 'AAAA-MM-DD'");
		fecha.setBounds(0,162,123,21);
		panel1.add(fecha);
		
		idpr=new JLabel("Id producto");
		idpr.setBounds(297,162,82,21);
		panel1.add(idpr);
/////////////////////textfield////////////////////////////////
		rut1=new JTextField();
		rut1.setBounds(117,91,147,21);
		panel1.add(rut1);
		
		id1=new JTextField();
		id1.setBounds(383,91,147,21);
		panel1.add(id1);
		
		fecha1=new JTextField();
		fecha1.setBounds(117,162,152,21);
		panel1.add(fecha1);
		
		idpr1=new JTextField();
		idpr1.setBounds(383,162,147,21);
		panel1.add(idpr1);
/////////////////////button////////////////////////////////
		
		venta=new JButton("Realizar Venta");
		venta.setBounds(141,264,123,28);
		panel1.add(venta);
		
		cancelar=new JButton("Cancelar");
		cancelar.setBounds(297,264,123,28);
		panel1.add(cancelar);
		
		
		
		
	}
	

}
