package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio2 {


	public static void main(String[] args){


		int x = 1000;
		double n = 10000000;
		double m = 18723568;
		int y = 2000;






		String message = "x es: " + x;
		String message1 = message + "\nx + y es: " + (y + x);
		String message2 = message1 + "\nx - y es: " + (x - y);
		String message3 = "x + m es: " + (x + m);
		String message31 = "x - m es: " + (x - m);
		String message4 = "y es: " + y;
		String message5 = "n es: " + n;
		String message6 = "m es: " + m;
		JOptionPane.showMessageDialog(null, message2, "Info",JOptionPane.INFORMATION_MESSAGE);
		
	}
}