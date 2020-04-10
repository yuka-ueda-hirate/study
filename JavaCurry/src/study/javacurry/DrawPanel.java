package study.javacurry;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

//�L�[�Ɗ֘A�t����ꂽ�l�̃R���N�V�������`����ъǗ�
//�A���`�G�C���A�X�̃q���g�L�[
import static java.awt.RenderingHints.KEY_ANTIALIASING;
//�A���`�G�C���A�X�̃q���g�l�ŁA�`��̓A���`�G�C���A�X���g���čs��
import static java.awt.RenderingHints.VALUE_ANTIALIAS_ON;


public class DrawPanel extends JPanel {
	 static final int C00 = 280;
	    static final int C01 = 360;
	    static final Color C02 = new Color(170, 0, 0);
	    static final Color C03 = new Color(250, 190, 20);
	    static final Color C04 = new Color(240, 30, 0);
	    static final Color C05 = new Color(240, 70, 0);
	    List<Parts> I00;

	    public DrawPanel() {
	    	setBackground(Color.white);
	    	//setPreferredSize:�e�L�X�g�̃t�B�[���h�T�C�Y���s�N�Z���Ŏw�肷��
	    	setPreferredSize(new Dimension(C00, C01));
		
	    	 I00 = new ArrayList<Parts>();

	         I00.add(new Box(10, 10, 260, 340, C03));
	         I00.add(new Text("�W���o�J���[", 25, 62, C02, 36));
	         I00.add(new Text("JAVA CURRY GOLD �S�[���h", 30, 84, C02, 16));
	         I00.add(new Text("�h��256�{", 176, 100, Color.red, 16));
	         I00.add(new Text("200g�E1�l��", 25, 330, Color.black, 10));
	         I00.add(new Circle(30, 105, 220, C02));
	         I00.add(new Circle(60, 135, 160, C04));
	         I00.add(new Circle(80, 155, 120, C05));
	         I00.add(new Circle(100, 175, 80, C03));
	         
	         System.out.print("������");
	}
	
	public void painComponet(Graphics A00) {
		 super.paintComponent(A00);
		// 2D �̐}�`�A�e�L�X�g�A����уC���[�W��`�悷��
		 Graphics2D L00 = (Graphics2D)A00;
		//�A���`�G�C���A�X������L��
		 L00.setRenderingHint(KEY_ANTIALIASING, VALUE_ANTIALIAS_ON);

        for (Parts L01 : I00) {
            L01.M00(L00);
        }
	}
}
