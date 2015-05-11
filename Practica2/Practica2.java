import javax.swing.*;

import java.awt.event.*;

public class Practica2 extends JFrame implements ActionListener{
    
	private JButton boton3,boton4,boton5,boton6,boton7,boton8, demo, instruc;
    public Practica2() {
    	setLayout(null);
    	setLocationRelativeTo(null);
        setTitle("Torres de Hanói");
        JLabel texto1 = new JLabel();
        texto1.setText("Bienvenido al juego");
        texto1.setBounds(10,20,110,20);
        add(texto1);
        JLabel texto2 = new JLabel();
        texto2.setText("Elija la opción que desee");
        texto2.setBounds(10,40,200,20);
        add(texto2);
        boton3=new JButton("3 discos");
        boton3.setBounds(10,100,90,30);
        add(boton3);
        boton3.addActionListener(this);
        boton4=new JButton("4 discos");
        boton4.setBounds(110,100,90,30);
        add(boton4);
        boton4.addActionListener(this);
        boton5=new JButton("5 discos");
        boton5.setBounds(210,100,90,30);
        add(boton5);
        boton5.addActionListener(this);
        boton6=new JButton("6 discos");
        boton6.setBounds(10,140,90,30);
        add(boton6);
        boton6.addActionListener(this);  
        boton7=new JButton("7 discos");
        boton7.setBounds(110,140,90,30);
        add(boton7);
        boton7.addActionListener(this);  
        boton8=new JButton("8 discos");
        boton8.setBounds(210,140,90,30);
        add(boton8);
        boton8.addActionListener(this);
        demo=new JButton("Demo");
        demo.setBounds(310,140,90,30);
        add(demo);
        demo.addActionListener(this);
        instruc=new JButton("Reglas");
        instruc.setBounds(310,100,90,30);
        add(instruc);
        instruc.addActionListener(this);
    }
    
    /*public void torreTres(){
		setTitle("Tres discos");
	}
    
    public void torreCuatro(){
		setTitle("Cuatro discos");
	}
    
    public void torreCinco(){
		setTitle("Cinco discos");
	}
    
    public void torreSeis(){
		setTitle("Seis discos");
	}
    
    public void torreSiete(){
		setTitle("Siete discos");
	}
    
    public void torreOcho(){
		setTitle("Ocho discos");
	}
    
    public void ejemplo(){
		setTitle("Ejemplo");
	}*/
	
	
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton3) {
        	torreTres t3 = new torreTres();
        	dispose();
        }
        if (e.getSource()==boton4) {
        	torreCuatro t4 = new torreCuatro();
        	dispose();
        }
        if (e.getSource()==boton5) {
        	torreCinco t5 = new torreCinco();
        	dispose();
        }  
        if (e.getSource()==boton6) {
        	torreSeis t6 = new torreSeis();
        	dispose();
        } 
        if (e.getSource()==boton7) {
        	torreSiete t7 = new torreSiete();
        	dispose();
        } 
        if (e.getSource()==boton8) {
        	torreOcho t8 = new torreOcho();
        	dispose();
        } 
        if (e.getSource()==demo) {
        	demo eje = new demo();
        	dispose();
        } 
        if (e.getSource()==instruc) {
        	instrucciones instru = new instrucciones();
        	dispose();
        } 
    }
    	
    	
    public static void main(String[] args){  	
    	
		Practica2 juego=new Practica2();
        juego.setBounds(0,0,430,220);
        juego.setVisible(true);
        juego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}