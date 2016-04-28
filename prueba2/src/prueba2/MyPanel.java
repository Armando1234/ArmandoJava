package prueba2;

import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel{


	float xa = 0;
	float ya= 0;


	float xb = 1000;
	float yb= 0;

	
	float xc = 0;
	float yc = 1000;
	
	
	float xd = 1000;
	float yd = 1000;
	
	
	double vxa = 0.5;
	double vya = 0.5;
	
	double vxb = -0.5;
	double vyb = 0.5;
	
	double vxc = 0.5;
	double vyc = -0.5;
	
	double vxd = -0.5;
	double vyd = -0.5;
	@Override
	public void paint(Graphics g){
		super.paint(g);

		g.fillOval((int)xa,(int) ya, 100, 100);
		g.fillOval((int)xb,(int) yb, 100, 100);
		g.fillOval((int)xc,(int) yc, 100, 100);
		g.fillOval((int)xd,(int) yd, 100, 100);


		
		xa = (float) (xa + vxa);
		ya = (float) (ya + vya);
		
		xb = (float) (xb + vxb);
		yb = (float) (yb + vyb);
		
		yc = (float) (yc + vyc);
		xc = (float) (xc + vxc);
		
		xd = (float) (xd + vxd);
		yd = (float) (yd + vyd);
		

	


		if(xa<0){
			vxa=0.5;
		}
		if(ya<0){
			vya=0.5;
		}
		if(xa>1000){
			vxa=-0.5;
		}
		if(ya>1000){
			vya=-0.5;
			
			
			
		}
		if(xb<0){
			vxb=0.5;
		}
		if(yb<0){
			vyb=0.5;
		}
		if(xb>1000){
			vxb=-0.5;
		}
		if(yb>1000){
			vyb=-0.5;
			
			
			
		}if(xc<0){
			vxc=0.5;
		}
		if(yc<0){
			vyc=0.5;
		}
		if(xc>1000){
			vxc=-0.5;
		}
		if(yc>1000){
			vyc=-0.5;
			
			
			
		}if(xd<0){
			vxd=0.5;
		}
		if(yd<0){
			vyd=0.5;
		}
		if(xd>1000){
			vxa=-0.5;
		}
		if(yd>1000){
			vyd=-0.5;
		}
		
		
		repaint();
	}
}


