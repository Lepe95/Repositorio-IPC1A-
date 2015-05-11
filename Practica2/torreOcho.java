import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class torreOcho extends JFrame {
	
	private JLabel texto, torre1, torre2, torre3, disco1, disco2, disco3, disco4, disco5, disco6, disco7, disco8;
	private JButton regresar;
	
	public torreOcho(){
		super();
		configuracion();
		inciarComponentes();
	}
	
	private void configuracion(){
		this.setTitle("Ocho Discos");
		this.setSize(660,500);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void inciarComponentes(){
		
		texto = new JLabel();
		texto.setText("Resuelva con 8 discos");
		texto.setBounds(20, 10, 135, 20);
		
		torre1 = new JLabel();
		torre1.setIcon(new ImageIcon(getClass().getResource("torre.png")));
		torre1.setBounds(20, 50, getWidth(), getHeight());
		
		torre2 = new JLabel();
		torre2.setIcon(new ImageIcon(getClass().getResource("torre.png")));
		torre2.setBounds(250, 50, getWidth(), getHeight());
		
		torre3 = new JLabel();
		torre3.setIcon(new ImageIcon(getClass().getResource("torre.png")));
		torre3.setBounds(470, 50, getWidth(), getHeight());
		
		disco1 = new JLabel();
		disco1.setIcon(new ImageIcon(getClass().getResource("disco1.png")));
		disco1.setBounds(20, -37, getWidth(), getHeight());
		
		disco2 = new JLabel();
		disco2.setIcon(new ImageIcon(getClass().getResource("disco2.png")));
		disco2.setBounds(20, -14, getWidth(), getHeight());
		
		disco3 = new JLabel();
		disco3.setIcon(new ImageIcon(getClass().getResource("disco3.png")));
		disco3.setBounds(20, 9, getWidth(), getHeight());
		
		disco4 = new JLabel();
		disco4.setIcon(new ImageIcon(getClass().getResource("disco4.png")));
		disco4.setBounds(20, 32, getWidth(), getHeight());
		
		disco5 = new JLabel();
		disco5.setIcon(new ImageIcon(getClass().getResource("disco5.png")));
		disco5.setBounds(20, 55, getWidth(), getHeight());
		
		disco6 = new JLabel();
		disco6.setIcon(new ImageIcon(getClass().getResource("disco6.png")));
		disco6.setBounds(20, 78, getWidth(), getHeight());
		
		disco7 = new JLabel();
		disco7.setIcon(new ImageIcon(getClass().getResource("disco7.png")));
		disco7.setBounds(20, 101, getWidth(), getHeight());
		
		disco8 = new JLabel();
		disco8.setIcon(new ImageIcon(getClass().getResource("disco8.png")));
		disco8.setBounds(20, 124, getWidth(), getHeight());
		
		regresar=new JButton("Regresar");
        regresar.setBounds(285,420,90,30);
        add(regresar);
		
		this.add(texto);
		this.add(disco1);
		this.add(disco2);
		this.add(disco3);
		this.add(disco4);
		this.add(disco5);
		this.add(disco6);
		this.add(disco7);
		this.add(disco8);
		this.add(torre1);
		this.add(torre2);
		this.add(torre3);
		this.add(texto);
		
		
	}
	
	public static void main(String[]args){
		
		torreOcho t8 = new torreOcho();
		t8.setVisible(true);
		
	}
	
	

}
