package GUI;

import java.awt.*;

import javax.swing.*;


public class crearproveedor extends JFrame {
	
	JLabel id,nombre,direccion,pagina,telefono;
	JTextField id1,nombre1,direccion1,pagina1,telefono1;
	JButton registrar,cancelar;
	Panel panel1;
	
	crearproveedor(){
		
		setTitle("Registrar Proveedor");
		setBounds(0,0,622,418);		
	    setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		panel1=new Panel();
		panel1.setBounds(10,10,586,359);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
/////////////////////label////////////////////////////////

		id=new JLabel("ID proveedor");
		id.setBounds(0,81,95,21);
		panel1.add(id);
		
		nombre=new JLabel("Nombre");
		nombre.setBounds(0,147,85,21);
		panel1.add(nombre);
		
		direccion=new JLabel("Direccion");
		direccion.setBounds(0,209,75,21);
		panel1.add(direccion);
		
		pagina=new JLabel("Pagina Web");
		pagina.setBounds(268,81,85,21);
		panel1.add(pagina);
		
		telefono=new JLabel("Telefono");
		telefono.setBounds(268,147,75,21);
		panel1.add(telefono);
		
		JLabel titulo =new JLabel("Para registrar un proveedor por favor llenar los siguientes datos");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		titulo.setBounds(28,11,526,21);
		panel1.add(titulo);
		
/////////////////////textfield////////////////////////////////
	
		id1=new JTextField();
		id1.setBounds(90,81,140,21);
		panel1.add(id1);
		
		nombre1=new JTextField();
		nombre1.setBounds(90,147,140,21);
		panel1.add(nombre1);
		
		pagina1=new JTextField();
		pagina1.setBounds(362,81,180,21);
		panel1.add(pagina1);
		
		telefono1=new JTextField();
		telefono1.setBounds(362,147,180,21);
		panel1.add(telefono1);
		
		direccion1=new JTextField();
		direccion1.setBounds(90,209,232,21);
		panel1.add(direccion1);
		
/////////////////////Button////////////////////////////////
		
		registrar=new JButton("Registrar");
		registrar.setBounds(155,295,108,29);
		panel1.add(registrar);
		
		cancelar=new JButton("Cancelar");
		cancelar.setBounds(295,295,108,29);
		panel1.add(cancelar);
		
		
		
	}

	public static void main(String[] args){
		crearproveedor cp=new crearproveedor();
		cp.setVisible(true);
		
	}
}
