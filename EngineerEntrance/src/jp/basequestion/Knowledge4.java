package jp.basequestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Knowledge4 {

public static final String Path = "C:\\Users\\yuka_ueda\\Documents\\業務\\2020業務\\Java学習\\JavaStudy\\EngineerEntrance\\";
	public static void main(String[] args) {
		/*
		 *  java.utilパッケージ Comparatorの利用
		 * ---TreeMap----------------------------------------------
		 * | キー値を一定のルールで並び替えが可能（引数で並び替えルールを指定）　　          |
		 * |                                                       |
		 * --------------------------------------------------------
		 * テキストファイルに記述された内容を1行ずつMapに格納し、以下の処理を行う
		 * 〇キーの文字列順序
		 * 〇キー名の短い順とし、同じ長さの場合、アルファベット順とする
		 * 〇テキストファイルはUTF-8形式で記述されたもの
		 * 〇改行コードはCRLFを使用
		 */
		try {
			String targetPath = Path + "sample2.txt";
			File file = new File(targetPath); //テキストファイル読込
			FileReader fileReader = new FileReader(file);
			BufferedReader buff = new BufferedReader(fileReader);
			
			String text;
			Map<String,String> map = new TreeMap<String,String>(new NameComparator()); //引数無＝アルファベット順
			
			while((text = buff.readLine()) != null) {
				String[] value = text.split(" ");
				map.put(value[0], value[1]); //メソッドの追加
			}
			fileReader.close();
			
			//entrySet():キーとセットのエントリーを取得する
			for(Map.Entry<String,String>e:map.entrySet()) {
				System.out.println(e.getKey()+":"+e.getValue());
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

class NameComparator implements Comparator<String>{
	
	@Override
	public int compare(String o1, String o2) {
		if(o1.length() > o2.length()) {
			return 1;
		}
		if(o1.length() < o2.length()) {
			return -1;
		}
		return o1.compareTo(o2);
	}
}
