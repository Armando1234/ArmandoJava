package main;

import java.awt.Color;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	
	
	public Ventana(){
		super.setSize(2000, 1200);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setResizable(false);
		super.setContentPane(new Panel());
		super.setVisible(true);
	
		
	}

}
