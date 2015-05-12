package sysVentasJava;
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

public class empleado extends JFrame implements ActionListener {
	
	JLabel imagen,fecha,ventahoy,fecha1,ventahoy1;
	JButton crear_usuario,venta_dia,consulta,ingresar,realizar_venta,modificar;
	JPanel panel1,panel2;
	Border bordejpanel,borde2;
	
	empleado(){
	//////////////////////////	
	setTitle("Menu Empleado");
	setBounds(0,0,637,401);
	getContentPane().setLayout(null);
	setIconImage(Toolkit.getDefaultToolkit().getImage(empleado.class.getResource("/sysVentasJava/ico-venta-equipo.png")));
	/////////////////////////
	
	bordejpanel= new TitledBorder(new EtchedBorder(), "Usuario");
	panel1 = new JPanel();
	panel1.setBackground(UIManager.getColor("CheckBox.light"));
	panel1.setBounds(10, 10, 224, 341);
	panel1.setBorder(bordejpanel);
	panel1.setLayout(null);
	getContentPane().add(panel1);	
	
	imagen=new JLabel("");
	imagen.setIcon(new ImageIcon(empleado.class.getResource("/sysVentasJava/descarga.jpg")));
	imagen.setBounds(52,23,125,141);
	panel1.add(imagen);	
	
	fecha=new JLabel("Fecha");
	fecha.setBounds(10,186,56,23);
	panel1.add(fecha);
	
	fecha1=new JLabel("aqui poner fecha");
	fecha1.setBounds(107,186,107,23);
	panel1.add(fecha1);
	
	ventahoy=new JLabel("Venta De Hoy");
	ventahoy.setBounds(10,220,74,23);
	panel1.add(ventahoy);
	
	ventahoy1=new JLabel("aqui poner monto");
	ventahoy1.setBounds(107,220,100,23);
	panel1.add(ventahoy1);
	
	//////////////////////////////////////
	
	panel2 = new JPanel();
	panel2.setBackground(UIManager.getColor("CheckBox.light"));
	panel2.setBounds(240, 10, 371, 341);
	panel2.setLayout(null);
	getContentPane().add(panel2);	
	borde2= new TitledBorder(new EtchedBorder(), "Opciones");
	panel2.setBorder(borde2);
	getContentPane().add(panel2);	
	
	//JButton crear_usuario,venta_dia,consulta,ingresar,realizar_venta,modificar;
	
	crear_usuario=new JButton("Crear Usuario");
	crear_usuario.setBackground(UIManager.getColor("Button.foreground"));
	crear_usuario.setForeground(Color.BLACK);
	crear_usuario.setBounds(10,49,115,38);
	panel2.add(crear_usuario);
	
}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	











}
