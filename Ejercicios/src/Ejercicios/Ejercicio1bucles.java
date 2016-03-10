package Ejercicios;

public class Ejercicio1bucles {
	
	public static void main (String[] args){
	
	int numerito = 0;
		int num = Lib.getInt("introduce un numero entero","un numero!");
		int prueba = num;
		while(prueba > 0){
			
			
			prueba = (prueba / 10);
			numerito ++;
		}
		System.out.println("tu numero tiene " + (numerito + " cifras!"));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
