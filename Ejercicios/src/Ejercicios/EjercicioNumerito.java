package Ejercicios;

import javax.swing.JOptionPane;

public class EjercicioNumerito {

	public static void main (String[] args){


		int u = 0; 


		String j = Lib.getString("Por favor, introduce la contrase�a");


		while(!j.equals("wwwww")){

			System.out.println("esa no es la contrase�a");
			j = Lib.getString("Por favor, introduce la contrase�a");
		}

		while(u != 7){
			u = Lib.getInt("Adivina mi numero, muajajajaja! (1 al 10)", "Mi numero, no mi letra.");
		}
		
		String message = "Has adivinado mi numero!!!";
		JOptionPane.showMessageDialog(null, message, "Info",JOptionPane.INFORMATION_MESSAGE);
		
	}
}
