package study.javacurry;

import java.awt.Color;
import java.awt.Graphics;

public class Circle implements Parts {
	int I00;
	int I01;
	int I02;
	Color I03;
	
	 Circle(int A00, int A01, int A02, Color A03) {
		this.I00 = A00;
        this.I01 = A01;
        this.I02 = A02;
        this.I03 = A03;
	}
	
	public void M00(Graphics A00) {
		A00.setColor(I03);
		//lŠpŒ`‚ğw’è‚µA‚»‚Ì“à‘¤‚É‚Õ‚Á‚½‚è‰Ÿ‚³‚Ü‚é‰~‚ğ•`‚­
		A00.fillOval(I00, I01, I02, I02);
	}

}
