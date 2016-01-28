package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio12Esfera {

	public static void main(String[] args){
		
		
		f("Escribe el radio de una esfera en metros");
		f("Escribe el radio de una esfera en centimetros");
		/* 765 / 100 = 7
		765 -(765/100) / 10 = 6
		765 ,,,,, = 5
		*/
		
	}
	
	public static void f(String radio){
		 double rad = Lib.getDouble(radio, "Un numero por favor...");
		 
		 
		 Double V = ((4.0 / 3.0) * Math.PI * rad * rad * rad);
		 
		
		 String Volumensaje = "El volumen de tu esfera (en m3) es: " + V;
		 
		 JOptionPane.showMessageDialog(null, Volumensaje, "Info",JOptionPane.INFORMATION_MESSAGE); 
		 
	}
}
