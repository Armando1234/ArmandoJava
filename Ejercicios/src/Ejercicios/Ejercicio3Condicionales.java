package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio3Condicionales {


	public static void main(String[] args){
		
		
		String porf = "Por favor, introduzca un numero";
		double c = -595975950;
		/*try{
			c = Double.parseDouble(JOptionPane.showInputDialog(null, porf, "Info",JOptionPane.INFORMATION_MESSAGE));;
		}catch(java.lang.NumberFormatException e){
			System.out.println("error eso no es un numero");
			System.exit(0);
		}*/
		
		
		while(c == -595975950){
			try{
				c = Double.parseDouble(JOptionPane.showInputDialog(null, porf, "Info",JOptionPane.INFORMATION_MESSAGE));
			}catch(java.lang.NumberFormatException e){
				System.out.println("error eso no es un numero");
				
			}
		}
		
		String message = "Tu numero Es par!";
		String imp = "Tu numero Es impar!";
		String multc = "Es multiplo de 5";

		String multd = "Es multiplo de 10";
		String multcn = "no es multiplo de 5";String multdn= "no Es multiplo de 10";
		String menc = "Es menor que 100!";
		String masc = "Es mayor que 100!";
		String nega = "Es negativo";
		String posi = "Es positivo!";
		
		
		
		
		
		
		if(c % 2 == 0){

			JOptionPane.showMessageDialog(null, message, "Info",JOptionPane.INFORMATION_MESSAGE);

		}else{

			JOptionPane.showMessageDialog(null, imp, "Info",JOptionPane.INFORMATION_MESSAGE);
		}


		if(c % 5 == 0){

			JOptionPane.showMessageDialog(null, multc, "Info",JOptionPane.INFORMATION_MESSAGE);

		}else{


			JOptionPane.showMessageDialog(null, multcn, "Info",JOptionPane.INFORMATION_MESSAGE);
		}

			if(c % 10 == 0){

				JOptionPane.showMessageDialog(null, multd, "Info",JOptionPane.INFORMATION_MESSAGE);

			}else{
				JOptionPane.showMessageDialog(null, multdn, "Info",JOptionPane.INFORMATION_MESSAGE);
				
			}
				if(c > 100){

					JOptionPane.showMessageDialog(null, masc, "Info",JOptionPane.INFORMATION_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(null, menc, "Info",JOptionPane.INFORMATION_MESSAGE);
				}

				if(c < 0){

					JOptionPane.showMessageDialog(null, nega, "Info",JOptionPane.INFORMATION_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(null, posi, "Info",JOptionPane.INFORMATION_MESSAGE);

				}
			}
		
	}


