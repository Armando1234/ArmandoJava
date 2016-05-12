package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args){
		
		Ventana v = new Ventana();
		
		int altoPantalla = 800;
		int anchoPantalla = 1200;
		v.setSize(anchoPantalla,altoPantalla);
		v.setVisible(true);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyPanel panel = new MyPanel();
		v.setContentPane(panel);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
