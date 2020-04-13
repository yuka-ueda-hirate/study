package com.original_game.janken;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JPanel;
 
public class Player implements ActionListener {
	public static void createButton(JPanel footerPanel) {
		//�{�^����\��
		JButton btnGu = new JButton("�O�[");
		btnGu = setButton(btnGu);
		footerPanel.add(btnGu, BorderLayout.WEST);
		
		JButton btnChoki = new JButton("�`���L");
		btnChoki = setButton(btnChoki);
		footerPanel.add(btnChoki, BorderLayout.CENTER);
		
		JButton btnPa = new JButton("�p�[");
		btnPa = setButton(btnPa);
		footerPanel.add(btnPa, BorderLayout.EAST);
	}
	public static JButton setButton(JButton button) {
		int buttonSizeX = (640 - 20)/3;
		Dimension buttonDimesion = new Dimension(buttonSizeX, 50);
		button.setPreferredSize(buttonDimesion);
		Font buttonFont = new Font("�l�r �S�V�b�N",Font.PLAIN,24);
		button.setFont(buttonFont);
		
		Player player = new Player();
		button.addActionListener(player);
		
		return(button);
	}
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		int playerHand = 0;
		if (command.equals("�O�[")) playerHand = 1;
		else if (command.equals("�`���L")) playerHand = 2;
		else if (command.equals("�p�["))  playerHand = 3;
		
		int computerHand = Computer.decidesComputerHand();
		VictoryOrDefeat.decisionVictoryOrDefeat(computerHand, playerHand);
	}
}