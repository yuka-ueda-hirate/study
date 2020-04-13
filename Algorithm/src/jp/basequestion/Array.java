package jp.basequestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {

	public static void main(String[] args) throws IOException {
		System.out.println("２つの整数値の四則演算結果を出力します。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 入力パラメータを読み込む
		String input = br.readLine();
		String[] param = input.split(" "); //入力値を空白で分解
		
		int num1 = Integer.parseInt(param[0]);
		int num2 = Integer.parseInt(param[1]);
		
		int sum = num1 + num2;
		int difference = num1 - num2;
		int accumulation = num1 * num2;
		int division = num1 / num2;
		int remainder = num1 % num2; 
		System.out.println("合計値：" + sum);
		System.out.println("差分値：" + difference);
		System.out.println("積値：" + accumulation);
		System.out.println("商値：" + division + "・・・" + remainder);
		

	}

}
