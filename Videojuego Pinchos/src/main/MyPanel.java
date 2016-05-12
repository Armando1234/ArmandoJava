package main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	
	int altoPantalla = 800;
	int anchoPantalla = 1200;
	float PuntPriX = 0f;

	float VelPriX = 1f;
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
	g.setColor(Color.RED);
		for(int i=0;i>10; i++){
		g.drawLine((int)PuntPriX, i*100+50 ,(int) PuntPriX, i*100+50);
		g.drawLine(anchoPantalla - (int)PuntPriX, i*100 + 50,anchoPantalla, i*100 + 50);
		}
		PuntPriX = VelPriX + PuntPriX;
		if(VelPriX > anchoPantalla){
			VelPriX = -1;
			VelPriX = VelPriX-1;
		}
		if(VelPriX < PuntPriX){
			VelPriX = 1;
			VelPriX = VelPriX +1;
		}
		
		repaint();
		
		}
		
		
		
		
		
	

}
