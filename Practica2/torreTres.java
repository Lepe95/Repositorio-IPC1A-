
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.TransferHandler;

import java.awt.event.*;


public class torreTres extends JFrame {
	
	private JLabel texto, torre1, torre2, torre3, disco1, disco2, disco3;
	private JButton regresar;
	
	public torreTres(){
		super();
		configuracion();
		inciarComponentes();
	}
	
	private void configuracion(){
		this.setTitle("Tres Discos");
		this.setSize(660,500);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void inciarComponentes(){
		
		texto = new JLabel();
		texto.setText("Resuelva con 3 discos");
		texto.setBounds(20, 10, 135, 20);
		
		
		torre1 = new JLabel();
		torre1.setIcon(new ImageIcon(getClass().getResource("torre.png")));
		torre1.setBounds(20, 50, getWidth(), getHeight());
		torre1.setEnabled(true);
		
		torre2 = new JLabel();
		torre2.setIcon(new ImageIcon(getClass().getResource("torre.png")));
		torre2.setBounds(250, 50, getWidth(), getHeight());
		torre2.setEnabled(true);
		
		torre3 = new JLabel();
		torre3.setIcon(new ImageIcon(getClass().getResource("torre.png")));
		torre3.setBounds(470, 50, getWidth(), getHeight());
		torre3.setEnabled(true);

		disco1 = new JLabel();
		disco1.setIcon(new ImageIcon(getClass().getResource("disco1.png")));
		disco1.setBounds(20, 78, getWidth(), getHeight());
		
		disco2 = new JLabel();
		disco2.setIcon(new ImageIcon(getClass().getResource("disco2.png")));
		disco2.setBounds(20, 101, getWidth(), getHeight());
		
		disco3 = new JLabel();
		disco3.setIcon(new ImageIcon(getClass().getResource("disco3.png")));
		disco3.setBounds(20, 124, getWidth(), getHeight());
	   
		
		regresar=new JButton("Regresar");
        regresar.setBounds(285,420,90,30);
        add(regresar);
		
		
		
		this.add(texto);
		this.add(disco1);
		this.add(disco2);
		this.add(disco3);
		this.add(torre1);
		this.add(torre2);
		this.add(torre3);
		
		
	}
	
	public void actionPerformed1(ActionEvent e) {
        if (e.getSource()==regresar) {
        	Practica2 p2 = new Practica2();
        	dispose();
        }
	}
	
	

	public static void main(String[]args){
		
		torreTres t3 = new torreTres();
		t3.setVisible(true);
		
	}

	
	
	

}
