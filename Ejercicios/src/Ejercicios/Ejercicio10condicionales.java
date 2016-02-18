package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio10condicionales {
	public static void main(String[] args){
		
		
		
		Double num = Lib.getDouble("Por favor introduzca un numero", "Un numero!");
		Double divisor = Lib.getDouble("Por favor introduzca un divisor, que no sea cero", "Un numero!");
		
		if(divisor == 0){
			String bronac = "No puedes dividir por 0";
			JOptionPane.showMessageDialog(null, bronac, "Info",JOptionPane.INFORMATION_MESSAGE);
		}else{
	
		String message = (num) + " / " + (divisor) + " = " + (num / divisor);
		JOptionPane.showMessageDialog(null, message, "Info",JOptionPane.INFORMATION_MESSAGE);
		
	
		}
	
		
	
		
		
		
		
		
	}
}
