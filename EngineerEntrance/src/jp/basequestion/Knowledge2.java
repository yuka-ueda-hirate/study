package jp.basequestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Knowledge2 {

public static final String Path = "C:\\Users\\yuka_ueda\\Documents\\�Ɩ�\\2020�Ɩ�\\Java�w�K\\JavaStudy\\EngineerEntrance\\";
	public static void main(String[] args) {
		/*
		 * java.util�p�b�P�[�W List�̗��p
		 * �e�L�X�g�t�@�C���ɋL�q���ꂽ���e��1�s����Map�Ɋi�[���A�ȉ��̏������s��
		 * �Z�P�s�ڂ��珇�ɏo�͂���
		 * �Z�ŏI�s����t����1�s�ڂ܂ŏo�͂���
		 * �Z������u�����������v���i�[����Ă���s�ԍ����o�͂���
		 * �Z�e�L�X�g�t�@�C����UTF-8�`���ŋL�q���ꂽ����
		 * �Z���s�R�[�h��CRLF���g�p
		 */
		try {
			String targetPath = Path + "sample.txt";
			File file = new File(targetPath); //�e�L�X�g�t�@�C���Ǎ�
			FileReader fileReader = new FileReader(file);
			BufferedReader buff = new BufferedReader(fileReader);
			
			String text;
			List<String>list = new ArrayList<String>();
			while((text = buff.readLine()) != null) {
				list.add(text); //�v�f�ǉ�
			}
			fileReader.close();
			
			for(String line:list) {
				System.out.println(line);
			}
			for(int index = list.size()-1; -1 < index; index --) {
				String line = list.get(index); //index(�v�f�ԍ�)�̗v�f���擾
				System.out.println(line);
			}
			int index = list.indexOf("����������");
			if(index != -1) {
				System.out.print((index + 1) + "�s��");
			}
			buff.close();
		}catch(FileNotFoundException fnoe) {
			//���̓t�@�C�����݂���Ȃ�
			System.out.println("�t�@�C�������݂��܂���");
			fnoe.printStackTrace();
		}catch(IOException ioe) {
			//readLine���\�b�h�ł̃t�@�C���ǂ݂��݂�write()���\�b�h�ł̃t�@�C���o�͎��G���[
			ioe.printStackTrace();
		}
	}

}