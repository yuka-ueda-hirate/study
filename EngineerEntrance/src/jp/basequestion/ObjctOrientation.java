package jp.basequestion;

public class ObjctOrientation {

	public static void main(String[] args) {
		/*
		 * �y�p���zAbstractAutomoblie�N���X���p������MyCar�N���X���쐬
		 * ---����---
		 * 1.�Ԏ�敪�F���ʎ�
		 * 2.�Ԏ�F���Ɨp�����{�b�N�X��
		 * 3.��Ԓ��:7�l
		 */
		Mycar car = new Mycar();
		System.out.println("�Ԏ�F" + car.getCarModel());
		System.out.println("����F" + car.getCapacity());
		System.out.println("�敪�F" + car.getCarTypeString());
		
	}
}
