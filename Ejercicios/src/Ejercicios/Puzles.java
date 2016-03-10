package Ejercicios;

import javax.swing.JOptionPane;

public class Puzles {

public static void main(String[] args){
	

	 String intros = "Por favor, introduzca su nombre.";
			 String nombre = JOptionPane.showInputDialog(null, intros, "Nivel 1",JOptionPane.INFORMATION_MESSAGE);
	String j = Lib.getString("Por favor, introduce la contraseña," + nombre);


	while(!j.equals("Puntero")){

		System.out.println("esa no es la contraseña");
		j = Lib.getString("Por favor, introduce la contraseña");
	}
	
	String h = "Acceso permitido. Quieres continuar?";
	String y = JOptionPane.showInputDialog(null, h, "Info",JOptionPane.INFORMATION_MESSAGE);
	
	
	 while(!y.equals("si")){
		 System.out.println("me lo tomare como un no, por tonto");
			 y = JOptionPane.showInputDialog(null, h, "Info",JOptionPane.INFORMATION_MESSAGE);			 
	 }
	 String intro = "Bienvenido, jugador 1. Este es el mundo de los desafios. ";
	 JOptionPane.showMessageDialog(null, intro, "Nivel 1",JOptionPane.INFORMATION_MESSAGE);
	 String hh = "Vale. Este es el desafio!!! Atento a la letra A." + "\n                          z          A         z";
	 JOptionPane.showMessageDialog(null, hh, "Nivel 1",JOptionPane.INFORMATION_MESSAGE);
	 String h1 = "     A          z         z";
			 String h2 = "     z          A         z";
	 
			 String h3 = "     z          z         A";
	 
			 JOptionPane.showMessageDialog(null, h1, "Nivel 1",JOptionPane.INFORMATION_MESSAGE);
			 JOptionPane.showMessageDialog(null, h3, "Nivel 1",JOptionPane.INFORMATION_MESSAGE);
			 JOptionPane.showMessageDialog(null, h2, "Nivel 1",JOptionPane.INFORMATION_MESSAGE);
			 JOptionPane.showMessageDialog(null, h2, "Nivel 1",JOptionPane.INFORMATION_MESSAGE);
			 JOptionPane.showMessageDialog(null, h3, "Nivel 1",JOptionPane.INFORMATION_MESSAGE);
			 
			 
			 String hhh = "Que cambios ha hecho??\n '<' = izquierda, '>' = derecha, '=' = centro";
			 y=JOptionPane.showInputDialog(null, hhh, "Nivel 1",JOptionPane.INFORMATION_MESSAGE);
			 
			 
			 if(!y.equals("<>==>")){
				 System.out.println("uyyy, me parece que no. Desafio no superado.");
						 
			 }else{
				 System.out.println("Enhorabuena! Has superado el desafio!!!!!");
			 }
			 
	
	
	
	
	
	
}
}
