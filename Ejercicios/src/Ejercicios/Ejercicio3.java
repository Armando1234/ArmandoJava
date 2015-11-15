package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio3{

	public static void main(String[] args){
		int n = 9;

		String message = "n es: " + n;
		
		n = n + 77;
		String message1 = message + "\n n ha aumentado! " + n ;

		n = n - 3;
		String message2 = message1 + "\n n ha decrementado! " + n;
		n = n * 2;
		String message3 = message2 + "\n n se ha duplicado! " + n;

		JOptionPane.showMessageDialog(null, message3, "Info",JOptionPane.INFORMATION_MESSAGE);
	}
	
	
}