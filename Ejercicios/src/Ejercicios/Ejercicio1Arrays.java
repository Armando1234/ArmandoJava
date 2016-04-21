package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio1Arrays {

	
	
	public static void main (String[] args) throws InterruptedException{
		
		
		
		int[] array = new int [5];
		
		array[0]= Lib.getInt("un numero, por favor. voy a calcular la media.", "un numero!");
		array[1]= Lib.getInt("otro, por favor. voy a calcular la media.", "un numero!");
		array[2]= Lib.getInt("otro, por favor. voy a calcular la media.", "un numero!");
		array[3]= Lib.getInt("otro, por favor. voy a calcular la media.", "un numero");
		array[4]= Lib.getInt("otro, por favor. voy a calcular la media.", "un Numero!");

		System.out.println("Calculando...");
		Thread.sleep(3000);
		int suma=0;
		for(int puntero = 0;puntero <5;puntero++){
			suma = suma + array[puntero];
		}
		JOptionPane.showMessageDialog(null, "La media de tus numeros es " + (suma/5) + "!");
	}

}
