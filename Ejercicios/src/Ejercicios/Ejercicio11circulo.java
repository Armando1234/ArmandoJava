package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio11circulo {


	public static void main(String[] args){

		double pi = Math.PI;

		String gggg = "Escribe el radio de una circumferencia";

		try{
			double C = Double.parseDouble(JOptionPane.showInputDialog(null, gggg, "Info",JOptionPane.INFORMATION_MESSAGE));
			String b = (" la longitud de tu circulo es " + (2 * pi * C) + " Y el area es " + (pi * C*C ));
			JOptionPane.showMessageDialog (null, b , "Info",JOptionPane.INFORMATION_MESSAGE);
		}catch(java.lang.NumberFormatException e){
			
			String hh = "Eso no es un numero!!!!!";
			JOptionPane.showMessageDialog (null, hh , "Info",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
