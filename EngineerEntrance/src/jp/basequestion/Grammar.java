package jp.basequestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grammar {

	public static void main(String[] args) throws Exception{
		//�N���p�����[�^�ɂ��Ă����ꂽ���������ׂĕ\������v���O����
//		System.out.println("������"+ args.length + "�w�肳��Ă��܂�");
//		for(int cnt = 0; cnt < args.length; cnt ++) {
//			System.out.println((cnt+1)+"�Ԗڂ̈����́u"+args[cnt] + "�ł��B");
//		}
		
		
		/*
		 * static�E�W�F�l���N�X�E�A�m�e�[�V����
		 * �N���p�����[�^�Ɏw�肳�ꂽ�����z��ɑ΂��A
		 * �ZList�^�̕ϐ��Ɋi�[����
		 * �ZList�^�̕ϐ��Ɋi�[���ꂽ�l��\������
		 */
		
		//Arrays�N���X��asList���\�b�h���Ăяo���B���̂܂܎g�p�ł��郁�\�b�h�̂��Ɓ�static���\�b�h
		//�W�F�l���N�X�F�ϐ��̐錾���Ɍ^���w�肵�A�����܂����𖳂���
		@SuppressWarnings("rawtypes") //�A�m�e�[�V�����F@�Ŏn�܂�L�q�B�����ł͌^��`�̌x���}���B
		List<String> lists = Arrays.asList(args);
		for(String list : lists) {
			System.out.println(list);
		}
	}

}
