package com.original_game.janken;

import javax.swing.JFrame;

public class GameMain {

	public static void main(String[] args) {
		// ウィンドウの設定
		//クラス名 インスタンス名= new クラス名();
		JFrame frame = new JFrame("じゃんけんゲーム");
		frame.setSize(640,480);
		frame.setLocationRelativeTo(null);//ウィンドウを画面の中心にする
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//×をクリックして閉じれるようにする
		frame.setResizable(false);
		
		//パネルの設定
		Panel.createPanel(frame);
		
		
		
		//ウィンドウ表示
		frame.setVisible(true);
	}
	

}
