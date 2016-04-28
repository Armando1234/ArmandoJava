package prueba2;

import javax.swing.JFrame;

public class Main {
  
	public static void main(String[] args){
		
		
		
		Ventana v = new Ventana();
		
		v.setSize(1200,1200);
		v.setVisible(true);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		v.setContentPane(panel);
	}
}
