package psn;


import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Panel extends JPanel {

	//lista de dibujables
	private ArrayList<Dibujable>dibujables = new ArrayList<>();
	public Panel(){

		
		for(int i=0; i<2880; i++){
			double rad = (float) Math.toRadians(i);
			
		Dibujable pelota = new Dibujable();
		pelota.setPosicion(600, 600);
		pelota.setVelocidad((float)(Math.cos(rad)), (float)(Math.sin(rad)));
		
		dibujables.add(pelota );
		}

	
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					repaint();
				}

				
			}
		});
		
		
		t.start();
		super.setBackground(Color.BLACK);
	}


	@Override
	public void paint(Graphics g) {
		super.paint(g);

		for(Dibujable d : dibujables){
			d.dibujar(g);
			d.mover();
		}
	}

}
