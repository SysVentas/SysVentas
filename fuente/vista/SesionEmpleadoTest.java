package vista;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.UIManager;

public class SesionEmpleadoTest extends JFrame {
	
	JLabel imagen,fecha,ventahoy,fecha1,ventahoy1;
	JButton crear_usuario,venta_dia,consulta,ingresar,realizar_venta,modificar,salir1;
	JPanel panel1,panel2;
	Border bordejpanel,borde2;
	JButton btnSalir;
	
	SesionEmpleadoTest(){
	//////////////////////////	
	setTitle("Menu Empleado");
	setBounds(0,0,637,401);
	getContentPane().setLayout(null);
	setIconImage(Toolkit.getDefaultToolkit().getImage(SesionEmpleadoTest.class.getResource("/vista/img/ico-venta-equipo.png")));
	/////////////////////////
	
	bordejpanel= new TitledBorder(new EtchedBorder(), "Usuario");
	panel1 = new JPanel();

	panel1.setBounds(10, 10, 224, 341);
	panel1.setBorder(bordejpanel);
	panel1.setLayout(null);
	getContentPane().add(panel1);	
	
	imagen=new JLabel("");
	imagen.setIcon(new ImageIcon(SesionEmpleadoTest.class.getResource("/vista/img/descarga.jpg")));
	imagen.setBounds(52,23,125,141);
	panel1.add(imagen);	
	
	fecha=new JLabel("Fecha");
	fecha.setBounds(10,186,56,23);
	panel1.add(fecha);
	
	fecha1=new JLabel("aqui poner fecha");
	fecha1.setBounds(107,186,107,23);
	panel1.add(fecha1);
	
	ventahoy=new JLabel("Venta De Hoy");
	ventahoy.setBounds(10,223,74,23);
	panel1.add(ventahoy);
	
	ventahoy1=new JLabel("aqui poner monto");
	ventahoy1.setBounds(107,220,100,23);
	panel1.add(ventahoy1);
	
	//////////////////////////////////////
	
	panel2 = new JPanel();
	panel2.setBounds(244, 10, 371, 228);
	panel2.setLayout(null);
	getContentPane().add(panel2);	
	borde2= new TitledBorder(new EtchedBorder(), "Opciones");
	panel2.setBorder(borde2);
	getContentPane().add(panel2);	
	
	//JButton crear_usuario,venta_dia,consulta,ingresar,realizar_venta,modificar;
	
	crear_usuario=new JButton("Crear Usuario");
	crear_usuario.setBounds(23,49,156,38);
	crear_usuario.addActionListener(new oyente());
	panel2.add(crear_usuario);
	
	venta_dia=new JButton("Venta Del Dia");
	venta_dia.setBounds(189,49,156,38);
	panel2.add(venta_dia);
	
	consulta=new JButton("Consultar Producto");
	consulta.setBounds(23,104,156,38);
	panel2.add(consulta);
	
	ingresar=new JButton("Ingresar Producto");
	ingresar.setBounds(189,104,156,38);
	panel2.add(ingresar);
	
	realizar_venta=new JButton("Realizar Venta");
	realizar_venta.setBounds(23,153,156,38);
	panel2.add(realizar_venta);
	
	modificar=new JButton("Modificar Producto");
	modificar.setBounds(189,153,156,38);
	panel2.add(modificar);
	
	salir1 = new JButton("Salir");
	salir1.setBounds(522, 307, 89, 23);
	salir1.addActionListener(new oyente());
	add(salir1);
	
	
	
	}
	public class oyente implements ActionListener{
	public void actionPerformed(ActionEvent e) {
        if (e.getSource()==salir1) {
        	setVisible(false);
        }
        
        if(e.getSource()==crear_usuario){
        	//Cliente crearC=new Cliente();
        	//crearC.setVisible(true);
        	
        }
        
	}
      
}
}

