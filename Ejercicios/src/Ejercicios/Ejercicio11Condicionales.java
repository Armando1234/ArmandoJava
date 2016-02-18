package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio11Condicionales {
	public static void main(String[] args){
		
		String message = "Escribe un caracter";
		String s = JOptionPane.showInputDialog(null, message, "Info",JOptionPane.INFORMATION_MESSAGE);
		char c = s.charAt(0);
		int cint = ((int) c);
		System.out.println(cint);
		if(cint < 91 && cint  > 64){
		
		
			String messsage = "Tu caracter es mayuscula!";
			JOptionPane.showMessageDialog(null, messsage, "Info",JOptionPane.INFORMATION_MESSAGE);
			
		}else{
			
			String mezage = "Tu caracter no es mayuscula!";
			JOptionPane.showMessageDialog(null, mezage, "Info",JOptionPane.INFORMATION_MESSAGE);
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
