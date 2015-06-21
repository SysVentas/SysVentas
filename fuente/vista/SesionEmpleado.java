package vista;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SesionEmpleado extends JFrame {
	Border borde,borde2;
	JLabel nombre1,apellido1;
	
	public SesionEmpleado(){
		setTitle("SysVentas - Principal");
		setBounds(0,0,700,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 300, 418);
		borde2= new TitledBorder(new EtchedBorder(), "Usuario");
		panel.setBorder(borde2);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel imagen = new JLabel("");
		imagen.setBounds(22, 21, 256, 256);
		imagen.setIcon(new ImageIcon(SesionEmpleado.class.getResource("/vista/img/venta.png")));
		panel.add(imagen);
		
		JButton actualizar = new JButton("Actualizar");
		actualizar.setBounds(182, 384, 96, 23);
		panel.add(actualizar);
		
		JLabel lblVentaCaja = new JLabel("Venta Caja :");
		lblVentaCaja.setBounds(10, 327, 67, 14);
		panel.add(lblVentaCaja);
		
		JLabel lblFecha = new JLabel("Fecha :");
		lblFecha.setBounds(10, 352, 46, 14);
		panel.add(lblFecha);
		
		JLabel lblBienvenido = new JLabel("Bienvenido ");
		lblBienvenido.setBounds(10, 302, 67, 14);
		panel.add(lblBienvenido);
		
		nombre1 = new JLabel();
		nombre1.setBounds(78, 302, 46, 14);
		panel.add(nombre1);
		
		apellido1 = new JLabel();
		apellido1.setBounds(123, 302, 46, 14);
		panel.add(apellido1);
		
		JLabel label = new JLabel("$ 000.000");
		label.setBounds(85, 327, 82, 14);
		panel.add(label);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  		String date = sdf.format(new Date()); 
		JLabel lblNewLabel_1 = new JLabel(date);
		lblNewLabel_1.setBounds(87, 352, 67, 14);
		panel.add(lblNewLabel_1);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(320, 11, 354, 418);
		borde = new TitledBorder(new EtchedBorder(), "Opciones");
		panel2.setBorder(borde);
		getContentPane().add(panel2);
		panel2.setLayout(null);

		/* MENU  */
		JMenuBar menu = new JMenuBar();
		setJMenuBar(menu);
		JMenu Ayuda = new JMenu("Ayuda");
		menu.add(Ayuda);
		JMenuItem Contacto = new JMenuItem("Contacto");
		Ayuda.add(Contacto);
		JMenuItem SobreNosotros = new JMenuItem("Sobre Nosotros");
		Ayuda.add(SobreNosotros);
		
		setVisible(true);
	}
	
	public void nombre(String nombre, String apellido){
		nombre1.setText(nombre);
		apellido1.setText(apellido);
	}
}
