package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio10catetos {
	public static void main(String[] args){
		
		String h = "Introduce la longitud de un cateto de triangulo";
		
		
		 double a = Double.parseDouble(JOptionPane.showInputDialog(null, h, "Info",JOptionPane.INFORMATION_MESSAGE));
	
		
		
		 
		 
		 
		 String h2 = "Introduce el segundo cateto";
		 
		 
		 double b = Double.parseDouble(JOptionPane.showInputDialog(null, h2, "Info",JOptionPane.INFORMATION_MESSAGE));
		 
		 
		double b2 = (b * b);
		double a2 = (a * a);
		double c2 = (a2 + b2);
		
		String hh = "La hipotenusa de tu triangulo, segun el teorema de pitagoras, es: " + (Math.sqrt(c2));
		
		JOptionPane.showMessageDialog(null, hh, "Info",JOptionPane.INFORMATION_MESSAGE);
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

