package psn;

import java.awt.Color;
import java.awt.Graphics;

public class Dibujable {

	private float x;
	private float y;
	private float vx;
	private float vy;
	
	
	public Dibujable(){
		
 
		
		
	}

	public void dibujar(Graphics g) {
	//	g.fillOval((int)x,(int) y, 5, 5);
	g.setColor(Color.BLUE);
		g.drawLine((int)x, (int) y, (int) (x+vx*100),(int) (y+vy*100));
	}
	
	public void mover(){
		x = x + vx;
		y = y + vy;
		if(x<0 || x> 1200 || y <0 || y > 1200){
			x = 500+vx*100;
			y = 500+vy*100;
		}
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
