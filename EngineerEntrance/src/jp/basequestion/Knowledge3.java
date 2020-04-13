package jp.basequestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Knowledge3 {

public static final String Path = "C:\\Users\\yuka_ueda\\Documents\\業務\\2020業務\\Java学習\\JavaStudy\\EngineerEntrance\\";
	public static void main(String[] args) {
		/*
		 * java.utilパッケージ Mapの利用
		 * ---MapとListの違い-----------------------------------------
		 * | Map:keyとvalueを保持。関連付けて呼び出し可能。※keyの重複不可          |
		 * | List:インデックス番号を保持。ソート可能。                                                      |
		 * --------------------------------------------------------
		 * テキストファイルに記述された内容を1行ずつMapに格納し、以下の処理を行う
		 * 〇1行目には、空白区切で2つの文字列が記述されており、１つ目をキー、２つ目を値としてMapに格納
		 * 〇全てのキーと値を出力
		 * 〇指定のキーを出力する
		 * 〇テキストファイルはUTF-8形式で記述されたもの
		 * 〇改行コードはCRLFを使用
		 */
		try {
			String targetPath = Path + "sample2.txt";
			File file = new File(targetPath); //テキストファイル読込
			FileReader fileReader = new FileReader(file);
			BufferedReader buff = new BufferedReader(fileReader);
			
			String text;
			Map<String,String> map = new HashMap<String,String>();
			
			while((text = buff.readLine()) != null) {
				String[] value = text.split(" ");
				map.put(value[0], value[1]); //メソッドの追加
			}
			fileReader.close();
			
			//entrySet():キーとセットのエントリーを取得する
			for(Map.Entry<String,String>e:map.entrySet()) {
				System.out.println(e.getKey()+":"+e.getValue());
			}
			String value = map.get("出身");
			if(value != null) {
				System.out.println("出身⇒" + value);
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
