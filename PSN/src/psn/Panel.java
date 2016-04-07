package psn;


import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Panel extends JPanel {

	//lista de dibujables
	private ArrayList<Dibujable>dibujables = new ArrayList<>();
	public Panel(){

		
		for(int i=0; i<1440; i++){
			double rad = (float) Math.toRadians(i);
			
		Dibujable pelota = new Dibujable();
		pelota.setPosicion(900, 500);
		pelota.setVelocidad((float)(Math.cos(rad)*Math.random()*4), (float)(Math.sin(rad)*Math.random()*2));
		
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
