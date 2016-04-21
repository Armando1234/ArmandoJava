package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Arbol {

	private static final float FACTOR_ANCHO =  0.05f;
	
	private static final float FACTOR_HIJOS = 0.75f;
	
	private static float GRADOS = 40;
	
	private Punto pFin;
	private Punto pIni;

	private Arbol r1;
	private Arbol r2;

	private long tini=System.currentTimeMillis();

	public Arbol(Punto pIni, Punto pFin) {
		this.pIni = pIni;
		this.pFin = pFin;


		generarHijos();
	}

	private void generarHijos() {

		Vector v = new Vector(pFin.x - pIni.x,pFin.y - pIni.y);
		if(v.modulo()>10){
			v.rotar(GRADOS);
			v.x = v.x*FACTOR_HIJOS;
			v.y = v.y*FACTOR_HIJOS;
			
			Punto pn1 = new Punto(pFin.x+v.x,pFin.y +v.y);
			//if(r1 == null){
				r1 = new Arbol(pFin,pn1);
			//}
			
			v.rotar((GRADOS*2));
			
			Punto pn2 = new Punto(pFin.x+v.x,pFin.y +v.y);
			//if(r2== null){
				r2 = new Arbol(pFin,pn2);
			}
	}

	public void dibujar(Graphics g) {
		Vector v = new Vector(pFin.x - pIni.x,pFin.y - pIni.y);
		Vector p = new Vector(-v.y*FACTOR_ANCHO, v.x*FACTOR_ANCHO);

		Punto p1 = new Punto(pIni.x + p.x, pIni.y + p.y );
		Punto p2 = new Punto(pFin.x + p.x, pFin.y + p.y );

		Punto p3 = new Punto(pFin.x - p.x, pFin.y - p.y );
		Punto p4 = new Punto(pIni.x - p.x, pIni.y - p.y );

		Polygon tronco = new Polygon();
		tronco.addPoint((int)p1.x, (int)p1.y);
		tronco.addPoint((int)p2.x, (int)p2.y);
		tronco.addPoint((int)p3.x, (int)p3.y);
		tronco.addPoint((int)p4.x, (int)p4.y);
		
		int r = (int) Math.max(Math.min(255, ((GRADOS%720)/720.0)*255),0);
		int bb = (int) Math.max(Math.min(255, b%255),0);
		b=b+0.0001f;
		g.setColor(new Color(255 ,255,255));
		g.fillPolygon(tronco);
		
		
		if(r1 != null){
			r1.dibujar(g);
		
		}
		
		if(r2 != null){
			r2.dibujar(g);
		
		}
	}
	static float b =0;
	
	public void rotar(){
		GRADOS = (float) ((tini-System.currentTimeMillis())/(1000.0/6));
		generarHijos();
	}
	
	

}
