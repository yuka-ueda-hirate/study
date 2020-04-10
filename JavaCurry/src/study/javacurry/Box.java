package study.javacurry;

import java.awt.Color;
import java.awt.Graphics;

//implements:インターフェイスを使う
public class Box implements Parts{
	int I00;
	int I01;
	int I02;
	int I03;
	Color I04;
	
	Box(int A00, int A01, int A02, int A03, Color A04){
		this.I00 = A00;
        this.I01 = A01;
        this.I02 = A02;
        this.I03 = A03;
        this.I04 = A04;
	}
	
	public void M00(Graphics A00) {
		A00.setColor(I04);
		//fillRect:内側を塗りつぶした四角形を作成
		A00.fillRect(I00, I01, I02, I03);
	}
	
}
