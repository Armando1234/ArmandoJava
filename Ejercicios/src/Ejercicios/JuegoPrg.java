package Ejercicios;

import javax.swing.JOptionPane;

public class JuegoPrg {
	public static void main(String[] args){
		
		String intros = "Por favor, introduzca su nombre.";
		String nombre = JOptionPane.showInputDialog(null, intros, "Nivel 1",JOptionPane.INFORMATION_MESSAGE);
		String j = Lib.getString("Por favor, introduce la contraseņa, " + nombre);
		int puntos = 0;

		while(!j.equals("mierda pa ti")){

			System.out.println("esa no es la contraseņa");
			j = Lib.getString("introduce la contraseņa, macho, que no es tan dificil");
			
			
			
		}
		System.out.println("Ahora te vas a chutar un trolleo");
		
	}

}
