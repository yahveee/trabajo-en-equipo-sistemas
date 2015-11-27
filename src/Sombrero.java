import java.awt.Color;

import acm.graphics.GRect;
import acm.program.*;
public class Sombrero  extends acm.program.GraphicsProgram{
	
		GRect copa;
		GRect ala;
		
		public void init(){
			setSize(800,600);
			
			copa = new GRect(60,20);
			copa.setFilled(true);
			copa.setFillColor(Color.GRAY);
			add(copa, 200, 150);
			
			ala = new GRect(100,0);
			ala.setFilled(true);
			ala.setFillColor(Color.BLACK);
			add(ala, 180, 170);
		}
	

}
