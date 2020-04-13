package jp.basequestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Knowledge {

public static final String Path = "C:\\Users\\yuka_ueda\\Documents\\業務\\2020業務\\Java学習\\JavaStudy\\EngineerEntrance\\";
	public static void main(String[] args) {
		/*
		 * java.ioパッケージ・テキストファイル入出力
		 * テキストファイルに記述された内容を表示し、異なるファイルに出力するプログラムを作成
		 * 〇読み込むファイル名、出力するファイル名、引数から取得
		 * 〇テキストファイルはUTF-8形式で記述されたもの
		 * 〇改行コードはCRLFを使用
		 */
		try {
			String targetPath = Path + "sample.txt";
			File file = new File(targetPath); //テキストファイル読込
			FileReader fileReader = new FileReader(file);
			BufferedReader buff = new BufferedReader(fileReader);
			
			String outPutPath = Path + "outPut.txt";
		    FileWriter writer = new FileWriter(outPutPath);//テキストファイルの出力
			String text;
			while((text = buff.readLine()) != null) {
				writer.write(text);
				writer.write("\r\n");
				//System.out.println(text);
				//System.out.println("\r\n");
			}
			writer.close();
			buff.close();
			fileReader.close();
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
