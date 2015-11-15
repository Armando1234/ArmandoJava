package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicioo10 extends EJERCCCCCCCCCCCCCCCICIO8{

	public static void main(String[] args){
		
		
		
		String message = " Por favor, escribe una temperatura en grados celsius ";
		double C = Double.parseDouble(JOptionPane.showInputDialog(null, message, "Info",JOptionPane.INFORMATION_MESSAGE));
		
		
		
		
	
		
	
		double F = 32 +(9 * C / 5);
		
	
		String messagetemp = "Tu temperatura en grados farenheit es " + F;
		JOptionPane.showMessageDialog (null, messagetemp , "Info",JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	
	
	
	
	
	
	
	
}
