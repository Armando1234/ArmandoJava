package Ejercicios;

import javax.swing.JOptionPane;

public class Lib {

	public static double getDouble(String message, String bronca){
		double C = 0.466874613;

		while(C == 0.466874613){
			try{
				C = Double.parseDouble(JOptionPane.showInputDialog(null, message, "Info",JOptionPane.INFORMATION_MESSAGE));
			}catch(java.lang.NumberFormatException e){
				JOptionPane.showMessageDialog (null, bronca , "Info",JOptionPane.INFORMATION_MESSAGE);
			}
		}
		return C;
	}

	public static int getInt(String message, String bronca) {
		int C = 466874613;

		while(C == 466874613){
			try{
				C = Integer.parseInt(JOptionPane.showInputDialog(null, message, "Info",JOptionPane.INFORMATION_MESSAGE));
			}catch(java.lang.NumberFormatException e){
				JOptionPane.showMessageDialog (null, bronca , "Info",JOptionPane.INFORMATION_MESSAGE);



			}
		}
		return C;
	}

	//crea un metodo que sume dos numeros y me de el resultado.....  int result = Lib.suma(5, 7);

	public static int suma(int numero1, int numero2) {

		int respuesta = (numero1 + numero2);	
		return respuesta;

	}

	public static int cubo(int num) {

		int respuesta = (num*num*num);	
		return respuesta;

	}

	public static int elevar(int num, int exp) {

		int respuesta = 1;	
		while(exp > 0){
			respuesta = respuesta * num;
			exp = exp -1;
		}
		return respuesta;

	}

	public static boolean tiempo(int hora, int minuto, int segundo) {


		if(hora < 24 && minuto < 59 && segundo < 59){
			if(hora > -1 && minuto > -1 && segundo > -1){
				return true;
			}
		}

		return false;
	}





	public static void getString(String message){
		int C = 466874613;

		while(C == 466874613){

			C = Integer.parseInt(JOptionPane.showInputDialog(null, message, "Info",JOptionPane.INFORMATION_MESSAGE));



		}
	}




	public static void mes(int mes) {

		if(mes > 12 && mes > -1 ){
			String peta = "Eso no es un numero de mes";
			JOptionPane.showMessageDialog(null,peta, "Info",JOptionPane.INFORMATION_MESSAGE);
		}else{
			
        String[] ArrayMeses = {"No hay mes, ", "Es Enero, ","Es Febrero,  ", "Es Marzo, ", "Es Abril, ", "Es Mayo, ","Es Junio, ","Es Julio, ","Es Agosto, ", "Es Septiembre, ", "Es Octubre, ", "Es Noviembre, ","Es Diciembre, "};
        String[] ArrayDias = {"Cero dias","31 dias","28 dias","31 dias","30 dias","31 dias","30 dias","31 dias","31 dias","30 dias","31 dias","30 dias","31 dias"};
        JOptionPane.showMessageDialog(null, ArrayMeses[mes] + ArrayDias[mes], "Info",JOptionPane.INFORMATION_MESSAGE);

		}
		

    	
    	
    	
    	

		}
	
	
	
}













