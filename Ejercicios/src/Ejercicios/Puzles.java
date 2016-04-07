package Ejercicios;

import javax.swing.JOptionPane;

public class Puzles {

	public static void main(String[] args) throws InterruptedException{


		String intros = "Por favor, introduzca su nombre.";
		String nombre = JOptionPane.showInputDialog(null, intros, "Nivel 1",JOptionPane.INFORMATION_MESSAGE);
		String j = Lib.getString("Por favor, introduce la contraseña, " + nombre);
		int puntos = 0;

		while(!j.equals("ss")){

			System.out.println("esa no es la contraseña");
			j = Lib.getString("Por favor, introduce la contraseña");
		}

		String h = "Acceso permitido. Quieres continuar?, " + nombre + "?" + "\n (si/no)";
		String y = JOptionPane.showInputDialog(null, h, "Info",JOptionPane.INFORMATION_MESSAGE);


		while(!y.equals("si")){
			System.out.println("me lo tomare como un no, por tonto");
			y = JOptionPane.showInputDialog(null, h, "Info",JOptionPane.INFORMATION_MESSAGE);			 
		}
		String intro = "Bienvenido, " + nombre + ". Este es... un sitio ";
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
			String k = ("uyyy, me parece que no. Desafio no superado.");
			JOptionPane.showMessageDialog(null, k, "Nivel 1",JOptionPane.INFORMATION_MESSAGE);

			System.exit(puntos);

		}else{
			String tt = ("Enhorabuena! Has superado el desafio!!!!!");
			JOptionPane.showMessageDialog(null, tt, "Nivel 1",JOptionPane.INFORMATION_MESSAGE);

			puntos++;
		}
		String punt = "Tu puntuacion actual es: " + puntos;
		JOptionPane.showMessageDialog(null, punt, "Nivel 2",JOptionPane.INFORMATION_MESSAGE);





		String niv2 = "Ahora pasaremos al nivel 2. Que quieres hacer?" + "\n (continuar/salir)";
		String o =JOptionPane.showInputDialog(null, niv2, "Nivel 2",JOptionPane.INFORMATION_MESSAGE);



		if(o == "salir"){
			System.exit(puntos);

		}else{

			Thread.sleep(5000);

			String trol = "Sabes que? mejor voy a añadirle un nivel al juego para hacerlo mas... interesante, por asi decirlo." + "\n               Adivina mi numero del 1 al 10!!!";
			int turnos = 5;
			String trolo = JOptionPane.showInputDialog(null, trol, "Nivel :D",JOptionPane.INFORMATION_MESSAGE);



			if(!trolo.equals(7)){
				System.out.println("JA! no es. Has perdido. Ya no te llevas los 100 puntos, jaja.");				
			}else{
				String win = "Bieeen, " + nombre + "!!! Has gana... Ejem... Bueno, has estado.. decentito. Toma un punto, pero solo porque soy majo.";
				puntos = puntos + 100;
				JOptionPane.showMessageDialog(null, win, "Nivel 2",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, punt, "Nivel 2",JOptionPane.INFORMATION_MESSAGE);









			}
		}




	}
}







