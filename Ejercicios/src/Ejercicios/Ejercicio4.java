package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio4 {
	public static void main(String[] args){

		/*
		int[] miArray = {2,5,7};
		
		miArray[1] = 90;
		JOptionPane.showMessageDialog(null, "" + miArray[1], "Info",JOptionPane.INFORMATION_MESSAGE);
		
		*/
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		
		String message = "variables guays: a = " + a + " b = " + b + " c = " + c + " d = " + d;
		b = c;
		c = a;
		a = d;
		d = b;
		String message3 = message + " \n nuevas variables guays: a = " + a + " b = " + b + " c = " + c + " d = " + d;
		
		
		

		JOptionPane.showMessageDialog(null, message3, "Info",JOptionPane.INFORMATION_MESSAGE);

}
}