package Ejercicios;

import javax.swing.JOptionPane;

public class EjercicioFacilYSencillo7 {
	public static void main(String[] args){
		
		
		
		
		String gggg = "Introduce un numero";
		
			try{
			double C = Double.parseDouble(JOptionPane.showInputDialog(null, gggg, "Info",JOptionPane.INFORMATION_MESSAGE));
			String b = (" Tu numero multiplicado por dos es " + (C * 2) + " Y por 3 es " + (C * 3));
			JOptionPane.showMessageDialog (null, b , "Info",JOptionPane.INFORMATION_MESSAGE);
			}catch(java.lang.NumberFormatException e){
				String hh = "Eso no es un numero!!!!!";
				JOptionPane.showMessageDialog (null, hh , "Info",JOptionPane.INFORMATION_MESSAGE);
				
     
			}
		
		
		
		
		
		
		
		
		
		
	}
}

