package com.original_game.janken;

import javax.swing.JFrame;

public class GameMain {

	public static void main(String[] args) {
		// �E�B���h�E�̐ݒ�
		//�N���X�� �C���X�^���X��= new �N���X��();
		JFrame frame = new JFrame("����񂯂�Q�[��");
		frame.setSize(640,480);
		frame.setLocationRelativeTo(null);//�E�B���h�E����ʂ̒��S�ɂ���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�~���N���b�N���ĕ����悤�ɂ���
		frame.setResizable(false);
		
		//�p�l���̐ݒ�
		Panel.createPanel(frame);
		
		
		
		//�E�B���h�E�\��
		frame.setVisible(true);
	}
	

}
