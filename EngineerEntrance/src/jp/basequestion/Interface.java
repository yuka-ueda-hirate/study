package jp.basequestion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Interface {

	public static void main(String[] args) {
		/*
		 * ４つの項目を持つCSVファイルを読込、指定された順序に並び替えて表示するプログラムを作成
		 * 項目：日付、最高気温、最低気温、平均気温
		 * 表示順：最高気温の高い順>最低気温の高い順>平均気温の高い順>日付の古い順
		 */
		try {
			FileReader file = new FileReader("data.csv");
			BufferedReader buff = new BufferedReader(file);
			String text;
			
			ArrayList<String[]>tempList = new ArrayList<String[]>();
			while((text = buff.readLine()) != null) {
				String data[] = text.split(",");
				tempList.add(data);
			}
			file.close();
			
			TemperatureComparator tc = new TemperatureComparator();//★生成
			Collections.sort(tempList,tc);//★Listの並べ替え（Collectionクラスのsortメソッド)
			
			for(String data[]:tempList) {
				System.out.println(data[1] + "," + data[2] +  "," + data[3] + "," + data[0]);
			}
		}catch(FileNotFoundException fnoe) {
			fnoe.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}

	}
}
