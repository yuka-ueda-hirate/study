package jp.basequestion;

public class Error {

	public static void main(String[] args) throws Exception{
		// プログラム中で、以下の例外を発生させる処理を記述し、その例外の詳細情報を出力する
		//　Null参照によるNullPointerException
		try{
			String name = null;
			name = name.substring(0); //実体の代入処理が無くsubstringメソッドが呼び出されている
		}catch(Exception ex){
			ex.printStackTrace();
		}
		// 配列の範囲外参照によるArrayIndexOutOfBoundsException
		try {
			String values[] = new String[2]; //定義した要素数は2つ（values[0],values[1])
			values[2] = "value"; //ここで参照しているのは定義していないvalues[2]
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		//　互換性のないオブジェクト型の変換によるClassCastException
		try {
			Object value = "value"; //オブジェクト型にString型
			Integer number = (Integer)value; //コンパイルエラーにはならないが、実行時に格納されている型がString→Integerに変換するとException発生
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
