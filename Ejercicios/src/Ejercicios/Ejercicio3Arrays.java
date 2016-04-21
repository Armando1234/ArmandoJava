package Ejercicios;

public class Ejercicio3Arrays {

	
	public static void main (String[] args){
		int suma = 0;
		int[]array = {1,5,8,1,3,4,6,8,1,5};
		for(int puntero = 0;puntero<5;puntero++){
		suma = suma + array[puntero*2];
		
		}
		
		System.out.println(suma/4);
		
		
		
		
	}
}
