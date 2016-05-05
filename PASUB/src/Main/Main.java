package Main;

import java.awt.Color;

import javax.swing.JFrame;

public class Main {
  
	public static void main (String[] args){
		
		Ventana v = new Ventana();
		
		v.setSize(2000,1000);
		v.setVisible(true);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		PanelSuperguayDeArmando panel = new PanelSuperguayDeArmando();
		v.setContentPane(panel);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
