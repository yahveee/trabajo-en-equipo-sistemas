import java.awt.Color;

import acm.graphics.GRect;
import acm.program.*;
public class Tronco extends acm.program.GraphicsProgram{
	
	GRect brazoD;
	GRect brazoI;
	GRect cuello;
	GRect tronco;
	
	public void init(){
		setSize(800,600);
		
		brazoD = new GRect(20,80);
		brazoD.setFilled(true);
		brazoD.setFillColor(Color.RED);
		add(brazoD, 150, 180);
		
		tronco = new GRect(60,60);
		tronco.setFilled(true);
		tronco.setFillColor(Color.GRAY);
		add(tronco, 170, 180);
		
		brazoI = new GRect(20,80);
		brazoI.setFilled(true);
		brazoI.setFillColor(Color.RED);
		add(brazoI, 230, 180);
		
		cuello = new GRect(30,5);
		cuello.setFilled(true);
		cuello.setFillColor(Color.WHITE);
		add(cuello, 185, 175);
	}

}
