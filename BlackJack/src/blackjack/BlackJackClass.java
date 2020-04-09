package blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class BlackJackClass {

	public static void main(String[] args) {
		
		System.out.println("ゲームを開始します。");		
		
		//空の山札を作成
		List<Integer>deck = new ArrayList<>(52);
		//山札をシャッフル
		shuffleDeck(deck);
		 
        //プレイヤー・ディーラーの手札リストを生成
        List<Integer>player = new ArrayList<>();
        List<Integer>dealer = new ArrayList<>();

        //プレイヤー・ディーラーがカードを2枚引く
        player.add(deck.get(0));
        player.add(deck.get(1));
        dealer.add(deck.get(2));
        dealer.add(deck.get(3));
        
        //山札の進行状況を記録する変数deckCountを定義
        int deckCount = 4;
        
        //プレイヤーの手札枚数を記録する変数playerHandsを定義
        int playerHands = 2;


       //プレイヤー・ディーラーの手札のポイントを表示
        System.out.println("あなたの1枚目のカードは" + toDescription(player.get(0)));
        System.out.println("ディーラーの1枚目のカードは" + toDescription(dealer.get(0)));
        System.out.println("あなたの2枚めのカードは" + toDescription(player.get(1)));
        System.out.println("ディーラーの2枚めのカードは秘密です。");

        //プレイヤー・ディーラーのポイントを集計
        int playerPoint = sumPoint(player);
        int dealerPoint = sumPoint(dealer);
        
        System.out.println("あなたの現在のポイントは" + playerPoint + "です。" );


        //プレイヤーがカードを引くフェーズ
        while(true) {
        	System.out.println("カードを引きますか？YES:y or NO:n");
        	
        	//キーボード入力
        	Scanner scan = new Scanner(System.in);
        	String str = scan.next();
        	
        	if("n".equals(str)){
        		break;
        	}else if("y".equals(str)) {
        		//手札の追加とバーストのチェック
        		player.add(deck.get(deckCount));
        		
        		//山札と手札を1枚進める
        		deckCount ++;
        		playerHands ++;
        		
        		System.out.println("あなたの" + playerHands +"枚目のカードは"+ toDescription(player.get(0)));
        		playerPoint = sumPoint(player);
        		System.out.println("現在の合計は:"+playerPoint);
        		
        		//プレイヤーのバーストチェック
        		if(isBusted(playerPoint)) {
        			System.out.println("残念、バーストしてしまいました");
        			return; //System.inに関してはクロースしない。⇒キーボードの入力ができなくなってしまう。
        		}
        		
        	}else {
        		System.out.println("あなたの入力は" + str +"です。yかnを入力してください。");
        	}
        }
        
        //ディーラーが手札を17以上にするまでカードを引くフェーズ
        while(true) {
        	//手札が17以上の場合、ブレーク
        	if(dealerPoint >= 17) {
        		break;
        	}else {
        		//手札から1枚加える
        		dealer.add(deck.get(deckCount));
        		//山札を1進める
        		deckCount ++;
        		
        		//ディーラーの合計ポイント計算
        		dealerPoint = sumPoint(dealer);
        		
        		//ディーラーのバーストチェック
        		if(isBusted(dealerPoint)) {
        			System.out.println("ディーラーがバーストしました。あなたの勝利です。");
        		}
        	}
        	
        }      
        
        //ポイントを比較する
        System.out.println("あなたのポイントは" + playerPoint);
        System.out.println("ディーラーのポイントは"+ dealerPoint);
        
        if(playerPoint == dealerPoint) {
        	System.out.println("引き分けです。");
        }else if(playerPoint > dealerPoint){
        	System.out.println("勝ちました！");
        }else {
        System.out.println("負けました・・・");
        }

	}
	
	
	//山札(deck)に値を入れ、シャッフルするメソッド
	private static void shuffleDeck(List<Integer>deck) {
		
		//リストに１～５２の連番を代入
		for(int i = 1;i <= 52;i++) {
			deck.add(i);
		}
		//山札シャッフル
		Collections.shuffle(deck);
		
		/*
		 * //リストの中身を確認(デバッグ用) for(int i=0; i<deck.size(); i++) {
		 * System.out.println(deck.get(i)); }
		 */
		
	}
	
	//手札がバーストしているか判定するメソッド
	private static boolean isBusted(int point) {
		if(point >= 21) {
			return true;
		}
		return false;
		
	}
	
	//現在の合計ポイントを計算するメソッド 
	private static int sumPoint(List<Integer>list) {
		int sum = 0;
		
		for(int i=0;i<list.size();i++) {
			sum = sum + toPoint(toNumber(list.get(i)));
		}
		return sum;
	}
	
	//山札の通し番号を得点計算用のポイントに変換するメソッド。J/Q/Kは10とする。
	private static int toPoint(int num) {
		if(num >= 10) {
			num = 10;
		}
		return num;
	}
	
	//山札の数を（スート）の（ランク）の文字列に置き換えるメソッド
	private static String toDescription(int cardNumber) {
		String rank = toRank(toNumber(cardNumber));
		String suit = toSuit(cardNumber);
		
		return suit + "の" + rank;
	}
	
	//山札の数をカードの数に置き換えるメソッド
	private static int toNumber(int cardNumber) {
		int number = cardNumber % 13;
		if(number == 0) {
			number = 13;
		}
		return number;
	}
	
	//カードの番号のランク（AやJ,Q,K)に変換するメソッド
	private static String toRank(int number) {
		switch(number) {
		case 1:
			return "A";
		case 11:
			return "J";
		case 12:
			return "Q";
		case 13:
			return "K";
		default:
			String str = String.valueOf(number);
			return str;
		}
	}
	
	//山札の数をスート（ハートやスペードなどのマーク）に置き換えるメソッド
	private static String toSuit(int cardNumber) {
		switch((cardNumber-1)/13) {
		case 0:
			return "クラブ";
		case 1:
			return "ダイヤ";
		case 2:
			return "ハート";
		case 3:
			return "スペード";
		default:
			return "例外です";
		}
	}
}
