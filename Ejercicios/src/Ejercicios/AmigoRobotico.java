package Ejercicios;

import javax.swing.JOptionPane;

public class AmigoRobotico {
public static void main(String[] args){
		
		String message = "Cual es tu nombre?";
		String nombre = JOptionPane.showInputDialog(null, message, "Info",JOptionPane.INFORMATION_MESSAGE);
		String messageName = "Buenos dias, " + nombre;
		String messagename2 = messageName + "\n Yo me llamo Armando";
		
		JOptionPane.showMessageDialog (null, messagename2, "Info",JOptionPane.INFORMATION_MESSAGE);
	
	    String pregunta = "Eres del Barca o del Madrid?";
	    String Equipo = JOptionPane.showInputDialog(null, pregunta, "Info",JOptionPane.INFORMATION_MESSAGE);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
}
