package jp.basequestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {

	public static void main(String[] args) throws IOException {
		System.out.println("�Q�̐����l�̎l�����Z���ʂ��o�͂��܂��B");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ���̓p�����[�^��ǂݍ���
		String input = br.readLine();
		String[] param = input.split(" "); //���͒l���󔒂ŕ���
		
		int num1 = Integer.parseInt(param[0]);
		int num2 = Integer.parseInt(param[1]);
		
		int sum = num1 + num2;
		int difference = num1 - num2;
		int accumulation = num1 * num2;
		int division = num1 / num2;
		int remainder = num1 % num2; 
		System.out.println("���v�l�F" + sum);
		System.out.println("�����l�F" + difference);
		System.out.println("�ϒl�F" + accumulation);
		System.out.println("���l�F" + division + "�E�E�E" + remainder);
		

	}

}
