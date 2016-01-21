package Ejercicios;

import javax.swing.JOptionPane;

public class EjercicioUltraFacilisimo4 {
	public static void main(String[] args){








		int a = 1;
		int b = 2;

		String me = ("La variable a =" + a + " La variable b =" + b);
		JOptionPane.showMessageDialog(null, me, "Info",JOptionPane.INFORMATION_MESSAGE);

		int c = b;
			
		b = a;
		
		a = c;
		
		

		String dd = ("La nueva variable a =" + a + " La nueva variable b =" + b);
		JOptionPane.showMessageDialog(null, dd, "Info",JOptionPane.INFORMATION_MESSAGE);

	}
}


/*
programa java a y b y que diga el valor y luego lo cambie
programa java s y t string. luego haz un mensaje uniendo s con t, t con s y t con t.


*/