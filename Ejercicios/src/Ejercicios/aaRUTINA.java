package Ejercicios;

import javax.swing.JOptionPane;

public class aaRUTINA{
	
	public static void main (String [] args){
		
		String nom = JOptionPane.showInputDialog(null, "Hola, soy ARMAN. como te llamas tu?", "hola! ",JOptionPane.INFORMATION_MESSAGE);
		int numtareas = Lib.getInt("Por favor, introduce el numero de cosas que hay que hacer hoy, " + nom, "he dicho NUMERO");
		
		String[] arraytareas = new String [numtareas];
		
		for(int q = 0;q > numtareas;q++){
			
			int k =1;
			String tarea1 = JOptionPane.showInputDialog(null, "Introduce la " + k +" tarea", "Tarea " + k,JOptionPane.INFORMATION_MESSAGE);
			arraytareas[q] = tarea1;
			k++;
			
		}
		JOptionPane.showMessageDialog(null, "bueno, empecemos con el plan", "Empezar",JOptionPane.INFORMATION_MESSAGE);
		for(int jh = 0;jh>numtareas;jh++ ){
			
			int hah = 1;
			JOptionPane.showMessageDialog(null, "La primera tarea es...\n" +  arraytareas[jh], "Tarea " + hah,JOptionPane.INFORMATION_MESSAGE);
			
			hah++;
		}
		
		JOptionPane.showMessageDialog(null, "Ya hemos terminado, " + nom + "?  Bien hecho! \n Un placer ayudarte,\n ARMAN =)", "fin ",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Hecho por aRmanMV con mucho curro :D ", ":D ",JOptionPane.INFORMATION_MESSAGE);
		
		
		
	}

}
