package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio12condicionales {

	public static void main(String[] args){


		int num = Lib.getInt("Por favor, introduzca un numero entero", "Un numero, melón!");
		int num2 = Lib.getInt("Por favor, introduzca un segundo numero entero", "Un numero, melón!");
		int num3 = Lib.getInt("Por favor, introduzca un tercer numero entero", "Un numero, melón!");
		int num4 = Lib.getInt("Por favor, introduzca un cuarto numero entero", "Un numero, melón!");
		int num5 = Lib.getInt("Por favor, introduzca un quinto numero entero", "Un numero, melón!");

		int con = 0; 

		//if(num % 10 == 2 && num2 % 10 == 2 && num3 % 10 == 2 && num4 % 10 == 2 && num5 % 10 == 2);
		if(num % 10 == 2){
			con++;
		}
		if(num2 % 10 == 2){
			con++;
		}

		if(num3 % 10 == 2){
			con++;	 
		}
		if(num4 % 10 == 2){
			con++;	 
		}
		if(num5 % 10 == 2){
			con++;
		}

		if(con == 1){
			String uno = "Uno de tus numeros acaba en 2";
			JOptionPane.showMessageDialog(null, uno, "Info",JOptionPane.INFORMATION_MESSAGE);
		}

		if(con == 2){
			String dos = "dos de tus numeros acaban en 2";
			JOptionPane.showMessageDialog(null, dos, "Info",JOptionPane.INFORMATION_MESSAGE);
		}
		if(con == 3){
			String tres = "tres de tus numeros acaban en 2";
			JOptionPane.showMessageDialog(null, tres, "Info",JOptionPane.INFORMATION_MESSAGE);
		}
		if(con == 4){
			String cuatro = "cuatro de tus numeros acaban en 2";
			JOptionPane.showMessageDialog(null, cuatro, "Info",JOptionPane.INFORMATION_MESSAGE);
		}
		if(con == 5){
			String cinco = "todos tus numeros acaban en 2";
			JOptionPane.showMessageDialog(null, cinco, "Info",JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
