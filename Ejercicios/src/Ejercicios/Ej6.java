package Ejercicios;

import javax.swing.JOptionPane;

public class Ej6 {
	public static void main(String[] args){
		
		String gggg = "Cual es tu nombre?";
		
		String nom = JOptionPane.showInputDialog(null, gggg, "Info",JOptionPane.INFORMATION_MESSAGE);
		String h = "Buenos Dias, " + nom;
		
		JOptionPane.showMessageDialog(null, h, "Info",JOptionPane.INFORMATION_MESSAGE);
	
		
		
		
		
		
		
		
		
	}
}
//Escribir nombre y dar buenos dias
// multiplicar un numero introducido por teclado x 2 y x 3