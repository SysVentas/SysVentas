package GUI;

import javax.swing.*;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class login extends JFrame {
	JTextField tex1;
	JPasswordField tex2;
	JButton ingresar;
	JButton salir;
	JLabel imagen;
	static int flag;
	
	public login(){
	/////////////////////////777	
	setTitle("login");
	setBounds(0,0,367,374);
    setIconImage(Toolkit.getDefaultToolkit().getImage(login.class.getResource("/sysVentasJava/ico-venta-equipo.png")));
    setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	getContentPane().setLayout(null);
	
	tex1 = new JTextField("usuario");
	tex1.setBounds(67,195,212,30);
	getContentPane().add(tex1);
	
	tex2 = new JPasswordField("");
	tex2.setBounds(67,236,212,30);
	getContentPane().add(tex2);
	
	ingresar=new JButton("Ingresar");
	ingresar.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
	ingresar.setBounds(105,277,97,30);
	getContentPane().add(ingresar);
	ingresar.addActionListener(new listener());
	
	salir =new JButton("Salir");
	salir.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
	salir.setBounds(216,277,63,30);
	getContentPane().add(salir);
	salir.addActionListener(new listener());
	
	imagen=new JLabel();
	imagen.setIcon(new ImageIcon(login.class.getResource("/sysVentasJava/ico-venta-equipo.png")));
	getContentPane().add(imagen);
	imagen.setBounds(95,8,165,176);
			
	}
	public class listener implements ActionListener{
	 public void actionPerformed(ActionEvent e) {
        if (e.getSource()==salir) {
            System.exit(0);
        }
      
        if(e.getSource()==ingresar){
        	empleado vent2=new empleado();
        	vent2.setVisible(true);
        	Admin vent3=new Admin();
        	vent3.setVisible(true);
        	setVisible(false);
        }
        
        
    }
	}
}
