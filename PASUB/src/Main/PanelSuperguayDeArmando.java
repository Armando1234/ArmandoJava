package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;
@SuppressWarnings ("serial")
public class PanelSuperguayDeArmando extends JPanel{

	float x = 0f;
	float y = 0f;
	float vx = 5.6689f;
	float vy = 0.5f;
	private Color c=getColorRandom();
	private int r;



	@Override
	public void paint(Graphics g){
		Area a = new Area();
		Shape orejad = new Ellipse2D.Double(450, 100, 300, 300);
		Shape orejai = new Ellipse2D.Double(950, 100, 300, 300);
		a.add(new Area(orejai));
		a.add(new Area(orejad));
		Shape cabeza = new Ellipse2D.Double(600, 200, 500, 500);
		a.add(new Area(cabeza));
		
		Shape ojoi = new Ellipse2D.Double(675, 300, 100, 100);
		a.subtract(new Area(ojoi));
		
		Shape ojod = new Ellipse2D.Double(925, 300, 100, 100);
		a.subtract(new Area(ojod));
		
		
		Shape clip4 = new Ellipse2D.Double(0, 0, 400, 200);
		//super.paint(g);
		Area b = new Area(new Rectangle2D.Double(0, 0, 4000, 4000));
		b.subtract(a);
		g.setClip(b);
		g.setColor(c);
		g.fillRect((int)x,(int) y, (int)(Math.random()*200), (int)(Math.random()*200));
		g.fillRect((int)x+9,(int) y+9, (int)(Math.random()*200), (int)(Math.random()*200));
		g.fillRect((int)x+18,(int) y+18,(int)(Math.random()*200), (int)(Math.random()*200));
		g.fillRect((int)x+27,(int) y+27,(int)(Math.random()*200), (int)(Math.random()*200));
		g.setClip(a);
		g.setColor(new Color(255,123,0,5));
		g.fillRect((int)x+27,(int) y+27,(int)(Math.random()*200), (int)(Math.random()*200));
		x = x+ vx;
		y = y+ vy;
		if(x < 0){
			vx = 5.6689f;
			//setBackground(getColorRandom());
			c = getColorRandom();
		}
		if(y < 0){
			vy = 0.5f;
			//setBackground(getColorRandom());
			c = getColorRandom();
		}
		if(x > 1900){
			vx = -5.6689f;
			//setBackground(getColorRandom());
			c = getColorRandom();
		}
		if(y > 900){
			vy = -0.5f;
			//setBackground(getColorRandom());
			c = getColorRandom();
		}



		repaint();
	}


	public Color getColorRandom(){

		int rr = (int)(Math.random()*255);
		int gg = (int)(Math.random()*255);
		int bb = (int)(Math.random()*255);
		
		return new Color((r+=10)%255,gg,0,3);
	}



}