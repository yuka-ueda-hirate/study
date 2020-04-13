package jp.basequestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grammar {

	public static void main(String[] args) throws Exception{
		//起動パラメータにしていされた引数をすべて表示するプログラム
//		System.out.println("引数は"+ args.length + "個指定されています");
//		for(int cnt = 0; cnt < args.length; cnt ++) {
//			System.out.println((cnt+1)+"番目の引数は「"+args[cnt] + "です。");
//		}
		
		
		/*
		 * static・ジェネリクス・アノテーション
		 * 起動パラメータに指定された引数配列に対し、
		 * 〇List型の変数に格納する
		 * 〇List型の変数に格納された値を表示する
		 */
		
		//ArraysクラスのasListメソッドを呼び出す。そのまま使用できるメソッドのこと＝staticメソッド
		//ジェネリクス：変数の宣言時に型を指定し、あいまいさを無くす
		@SuppressWarnings("rawtypes") //アノテーション：@で始まる記述。ここでは型定義の警告抑制。
		List<String> lists = Arrays.asList(args);
		for(String list : lists) {
			System.out.println(list);
		}
	}

}
