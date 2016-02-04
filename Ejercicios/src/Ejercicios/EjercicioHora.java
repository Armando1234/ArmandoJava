package Ejercicios;

import javax.swing.JOptionPane;

public class EjercicioHora {

	public static void main(String[] args){
		
		
		
		if(Lib.tiempo(Lib.getInt("introduce una hora", "Eso no es un numero"), Lib.getInt("introduce un minuto", "Eso no es un numero"), Lib.getInt("introduce un segundo", "Eso no es un numero"))){
			String f = "La hora introducida es una hora valida";
			JOptionPane.showMessageDialog (null, f , "Info",JOptionPane.INFORMATION_MESSAGE);
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
