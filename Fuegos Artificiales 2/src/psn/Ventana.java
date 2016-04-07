package psn;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	
	
	public Ventana(){
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setSize(2000,1200);
		super.setContentPane(new Panel());
		super.setVisible(true);
		
		super.setResizable(false);
	}

}
