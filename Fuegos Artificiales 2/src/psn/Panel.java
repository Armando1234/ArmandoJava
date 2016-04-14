package psn;


import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Panel extends JPanel {

	//lista de dibujables
	private ArrayList<Dibujable>dibujables = new ArrayList<>();
	
	public Panel(){

		


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
		
		for(int i = 0;i<5;i++){
			if(!dibujables.isEmpty()){
				dibujables.remove((int)(Math.random()*dibujables.size()));
			}
			
		}
		if(dibujables.isEmpty()){
			generarExplosion();
		}
		for(Dibujable d : dibujables){
			d.dibujar(g);
			d.mover();
		}
	}

	private void generarExplosion(){
		int xExplosion =(int) (Math.random()*2000);
		int yExplosion =(int) (Math.random()*600);
		for(int i=0; i<1440; i++){
			double rad = (float) Math.toRadians(i);

			Dibujable pelota = new Dibujable();
			double fuerza = 2.0;
			pelota.setPosicion(xExplosion, yExplosion);
			pelota.setVelocidad((float)(Math.cos(rad)*Math.random()*fuerza), (float)(Math.sin(rad)*Math.random()*fuerza));

			dibujables.add(pelota );
		}
	}
	
}
