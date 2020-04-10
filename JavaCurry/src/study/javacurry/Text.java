package study.javacurry;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.lang.String;

public class Text implements Parts {
    String I00;
    int I01;
    int I02;
    Color I03;
    int I04;

    Text(String A00, int A01, int A02, Color A03, int A04) {
        this.I00 = A00;
        this.I01 = A01;
        this.I02 = A02;
        this.I03 = A03;
        this.I04 = A04;
    }
	
    public void M00(Graphics A00) {
        A00.setColor(I03);
        A00.setFont(new Font("SansSerif", Font.BOLD, I04));
		//drawString:文字を指定された位置へ配置(str,x,y)
        A00.drawString(I00, I01, I02);
	}

}
