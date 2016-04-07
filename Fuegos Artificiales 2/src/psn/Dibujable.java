package psn;

import java.awt.Color;
import java.awt.Graphics;

public class Dibujable {

	private float x;
	private float y;
	private float vx;
	private float vy;
	private Color color;
	
	
	public Dibujable(){
		
 
		
		
	}

	
	public void setColor(int r,int g,int b){
		//color = new Color (r,g,b);
	}
	public void dibujar(Graphics g) {
		//g.fillOval((int)x,(int) y, 200, 10);
	//&g.setColor(color);
	g.setColor(Color.RED);
		g.drawLine((int)x, (int) y, (int) (x+vx*40),(int) (y+vy*40));
	}
	
	public void mover(){
		x = x + vx;
		y = y + vy;

		
		vy = (float) (vy + 0.005);
	}
	public void setVelocidad(float vx, float vy){
	this.vx = vx;
	this.vy = vy;
	

	}
	

	     
		
		
		
		
		
		
	
	
	
	
	public void setPosicion(float x, float y){
	this.x = x;
	this.y = y;
		
		
		
	}
}
