package com.original_game.janken;

public class VictoryOrDefeat {
	private static int point = 0;
	public static final void decisionVictoryOrDefeat(int computerHand,int playerHand) {
		int playerHandTemp = playerHand;
		playerHandTemp++;
		
		if(playerHand == computerHand) {
			Panel.headerLabel.setText("あいこだよ！(" + point + ")");
		}else if((playerHand == 3 && computerHand ==1)||(playerHandTemp == 2 && computerHand == 3)||(playerHandTemp == 1 && computerHand==2)){
			point+=1;
			Panel.headerLabel.setText("プレイヤーの勝ち！(" + point + ")");
		}else {
			point=0;
			Panel.headerLabel.setText("プレイヤーの負け！(" + point + ")");
		}
	}
}
