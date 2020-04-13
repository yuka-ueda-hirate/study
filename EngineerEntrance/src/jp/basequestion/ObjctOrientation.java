package jp.basequestion;

public class ObjctOrientation {

	public static void main(String[] args) {
		/*
		 * 【継承】AbstractAutomoblieクラスを継承したMyCarクラスを作成
		 * ---条件---
		 * 1.車種区分：普通車
		 * 2.車種：自家用ワンボックス車
		 * 3.乗車定員:7人
		 */
		Mycar car = new Mycar();
		System.out.println("車種：" + car.getCarModel());
		System.out.println("定員：" + car.getCapacity());
		System.out.println("区分：" + car.getCarTypeString());
		
	}
}
