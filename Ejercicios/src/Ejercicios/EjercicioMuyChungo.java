package Ejercicios;

public class EjercicioMuyChungo {

	public static void main(String [] args){



		int numElementos = 5;		


		int[] miarray = new int [numElementos];
		int puntero = 0;
		int suma = 0;


		
		
		
		while(puntero < numElementos){

			miarray[puntero] = Lib.getInt("por favor, introduce un numero entero", "un numero!");
			System.out.println("En la posicion " + puntero + " esta: " + miarray[puntero]);
			puntero++;
		}


		while(puntero < numElementos){
			
			suma = miarray[puntero];
		
			
			
			puntero++;
		}





	}

}
