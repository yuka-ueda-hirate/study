package jp.basequestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursive {

	public static void main(String[] args) throws IOException {
		System.out.println("式を入力：");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 入力パラメータを読み込む
		String input = br.readLine();
		String[] param = input.split(""); //入力値を空白で分解
		int sum = calc(param,0,param.length-1);
		System.out.println(sum);

	}
	
	//再帰関数
	public static int calc(String[] param,int startIdx,int endIdx) {
		int sum = 0;
		String type = null;
		for(int idx = startIdx; idx < endIdx; idx++) {
			if(param[idx].equals("+") || param[idx].equals("-")) {
				type = param[idx];
			}else if(param[idx].equals("(")) {
				int endOffFormula = checkEndOffFormula(param,idx);
				if(type != null) {
					if(type.equals("+")) {
						sum = sum + calc(param,idx+1,endOffFormula-1);
					}else if(type.equals("-")) {
						sum = sum - calc(param,idx+1,endOffFormula-1);
					}
				}else {
					sum = calc(param,idx+1,endOffFormula-1);
				}
				idx = endOffFormula;
			}else {
				int num = Integer.parseInt(param[idx]);
				if(type != null) {
					if(type.equals("+")) {
						sum = sum + num;
					}else if(type.equals("-")) {
						sum = sum - sum;
					}
				}else {
					sum = sum + num;
				}
			}
		}return sum;
	}
	
	public static int checkEndOffFormula(String[] param, int startIdx) {
		int end = startIdx + 1;
		int startCount = 0;
		for(int idx = startIdx+1; idx < param.length; idx++) {
			end = idx;
			if(param[idx].equals("(")) {
				startCount ++;
			}else if(param[idx].equals(")")){
				if(startCount == 0) {
					break;
				}else {
					startCount --;
				}
			}
		}return end;
	}
}
