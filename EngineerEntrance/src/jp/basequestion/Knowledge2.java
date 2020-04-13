package jp.basequestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Knowledge2 {

public static final String Path = "C:\\Users\\yuka_ueda\\Documents\\業務\\2020業務\\Java学習\\JavaStudy\\EngineerEntrance\\";
	public static void main(String[] args) {
		/*
		 * java.utilパッケージ Listの利用
		 * テキストファイルに記述された内容を1行ずつMapに格納し、以下の処理を行う
		 * 〇１行目から順に出力する
		 * 〇最終行から逆順に1行目まで出力する
		 * 〇文字列「あいうえお」が格納されている行番号を出力する
		 * 〇テキストファイルはUTF-8形式で記述されたもの
		 * 〇改行コードはCRLFを使用
		 */
		try {
			String targetPath = Path + "sample.txt";
			File file = new File(targetPath); //テキストファイル読込
			FileReader fileReader = new FileReader(file);
			BufferedReader buff = new BufferedReader(fileReader);
			
			String text;
			List<String>list = new ArrayList<String>();
			while((text = buff.readLine()) != null) {
				list.add(text); //要素追加
			}
			fileReader.close();
			
			for(String line:list) {
				System.out.println(line);
			}
			for(int index = list.size()-1; -1 < index; index --) {
				String line = list.get(index); //index(要素番号)の要素を取得
				System.out.println(line);
			}
			int index = list.indexOf("あいうえお");
			if(index != -1) {
				System.out.print((index + 1) + "行目");
			}
			buff.close();
		}catch(FileNotFoundException fnoe) {
			//入力ファイルがみつからない
			System.out.println("ファイルが存在しません");
			fnoe.printStackTrace();
		}catch(IOException ioe) {
			//readLineメソッドでのファイル読みこみやwrite()メソッドでのファイル出力時エラー
			ioe.printStackTrace();
		}
	}

}