package jp.basequestion;

public class ObjctOrientation {

	public static void main(String[] args) {
		/*
		 * ypณzAbstractAutomoblieNX๐pณตฝMyCarNX๐์ฌ
		 * ---๐---
		 * 1.ิํๆชFสิ
		 * 2.ิํFฉฦp{bNXิ
		 * 3.ๆิ่๕:7l
		 */
		Mycar car = new Mycar();
		System.out.println("ิํF" + car.getCarModel());
		System.out.println("่๕F" + car.getCapacity());
		System.out.println("ๆชF" + car.getCarTypeString());
		
	}
}
