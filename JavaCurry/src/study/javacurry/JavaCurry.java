package study.javacurry;

import java.awt.Color;
import java.lang.String;
import javax.swing.JFrame;

public class JavaCurry extends JFrame{
	
	public JavaCurry() {
		add(new DrawPanel());
	}
	
	 public static void main(String[] A00) {
	        JFrame L00 = new JavaCurry();
	        L00.setTitle("オブジェクト指向レトルトカレー");
	        L00.setDefaultCloseOperation(EXIT_ON_CLOSE);
	        L00.setBackground(Color.white);
	        L00.pack();
	        L00.setResizable(false);
	        L00.setVisible(true);
	    }

}
