package Ejercicios;

import javax.swing.JOptionPane;

public class fg {
	public static void main(String[] args){

		String gggg = "Escribe una velocidad en kilometros por hora";

		try{
			double C = Double.parseDouble(JOptionPane.showInputDialog(null, gggg, "Info",JOptionPane.INFORMATION_MESSAGE));
			String b = (" Tu velocidad en metros por hora es" + (C * 1000));
			
			JOptionPane.showMessageDialog (null, b , "Info",JOptionPane.INFORMATION_MESSAGE);
			String iioo = " Tu velocidad en metros por segundo es" + (C / 3600);
			
			JOptionPane.showMessageDialog (null, iioo , "Info",JOptionPane.INFORMATION_MESSAGE);
		}catch(java.lang.NumberFormatException e){

			String hh = "Eso no es un numero!!!!!";
			JOptionPane.showMessageDialog (null, hh , "Info",JOptionPane.INFORMATION_MESSAGE);	
		}
			
		
		
			
			

		
	}
}