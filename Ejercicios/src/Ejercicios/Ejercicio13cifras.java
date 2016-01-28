package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio13cifras {
	public static void main(String[] args){
		
		
		String intro = "Por favor, introduzca un numero positivo de 3 cifras";
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, intro, "Info",JOptionPane.INFORMATION_MESSAGE));
		
		while(num > 999 || num < 0){
			String bronca = "De tres cifras y positivo, melon!";
			JOptionPane.showMessageDialog(null, bronca, "Info",JOptionPane.INFORMATION_MESSAGE);
			num = Integer.parseInt(JOptionPane.showInputDialog(null, intro, "Info",JOptionPane.INFORMATION_MESSAGE));
		}

		int n1 = (num / 100);
		int n2 = (num % 100) / 10;
		int n3 = (num % 10);
		
		
				
		String nums = "La primera cifra es: " + n1 + ". La segunda es: " + n2 + ". Y la tercera es: " + n3;		
		
		
		JOptionPane.showMessageDialog(null, nums, "Info",JOptionPane.INFORMATION_MESSAGE);
		
		
		int result = Lib.elevar(2, 5);
		
		System.out.println(result);
		
	}
}
