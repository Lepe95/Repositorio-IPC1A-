import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.*;


public class instrucciones extends JFrame implements ActionListener {
	
	private JLabel texto, texto1, texto2, texto3, texto4, texto5, texto6, texto7;
	private JButton regresar;
	
	public instrucciones(){
		super();
		configuracion();
		inciarComponentes();
	}
	
	private void configuracion(){
		this.setTitle("Instrucciones");
		this.setSize(250,250);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void inciarComponentes(){
		
		texto = new JLabel();
		texto.setText("Instrucciones:");
		texto.setBounds(10, 05, 240, 15);
		
		texto1 = new JLabel();
		texto1.setText("Debe mover los discos de una torre a");
		texto1.setBounds(10, 25, 240, 15);
		
		texto2 = new JLabel();
		texto2.setText("otra a manera de ordenarlos como la");
		texto2.setBounds(10, 40, 240, 15);
		
		texto3 = new JLabel();
		texto3.setText("primer torre, siguiento las siguientes");
		texto3.setBounds(10, 55, 240, 15);
		
		texto4 = new JLabel();
		texto4.setText("reglas:");
		texto4.setBounds(10, 70, 240, 15);
		
		texto5 = new JLabel();
		texto5.setText("- Solo puede mover un disco a la vez.");
		texto5.setBounds(10, 95, 240, 15);
		
		texto6 = new JLabel();
		texto6.setText("- No puede colocar un disco mas grande");
		texto6.setBounds(10, 110, 240, 15);
		
		texto7 = new JLabel();
		texto7.setText("sobre otro de menor tamaño.");
		texto7.setBounds(10, 120, 240, 15);
		
		regresar=new JButton("Regresar");
        regresar.setBounds(75,165,90,30);
        add(regresar);
        regresar.addActionListener(this);
		
		
		this.add(texto);
		this.add(texto1);
		this.add(texto2);
		this.add(texto3);
		this.add(texto4);
		this.add(texto5);
		this.add(texto6);
		this.add(texto7);
	}
	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource()==regresar) {
        	Practica2 p2 = new Practica2();
        	dispose();
        }
	}
			
		
	public static void main(String[]args){
		
		instrucciones Instrucciones = new instrucciones();
		Instrucciones.setVisible(true);
		
	}
		
}
	
