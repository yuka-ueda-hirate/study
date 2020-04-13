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

public static final String Path = "C:\\Users\\yuka_ueda\\Documents\\�Ɩ�\\2020�Ɩ�\\Java�w�K\\JavaStudy\\EngineerEntrance\\";
	public static void main(String[] args) {
		/*
		 *  java.util�p�b�P�[�W Comparator�̗��p
		 * ---TreeMap----------------------------------------------
		 * | �L�[�l�����̃��[���ŕ��ёւ����\�i�����ŕ��ёւ����[�����w��j�@�@          |
		 * |                                                       |
		 * --------------------------------------------------------
		 * �e�L�X�g�t�@�C���ɋL�q���ꂽ���e��1�s����Map�Ɋi�[���A�ȉ��̏������s��
		 * �Z�L�[�̕����񏇏�
		 * �Z�L�[���̒Z�����Ƃ��A���������̏ꍇ�A�A���t�@�x�b�g���Ƃ���
		 * �Z�e�L�X�g�t�@�C����UTF-8�`���ŋL�q���ꂽ����
		 * �Z���s�R�[�h��CRLF���g�p
		 */
		try {
			String targetPath = Path + "sample2.txt";
			File file = new File(targetPath); //�e�L�X�g�t�@�C���Ǎ�
			FileReader fileReader = new FileReader(file);
			BufferedReader buff = new BufferedReader(fileReader);
			
			String text;
			Map<String,String> map = new TreeMap<String,String>(new NameComparator()); //���������A���t�@�x�b�g��
			
			while((text = buff.readLine()) != null) {
				String[] value = text.split(" ");
				map.put(value[0], value[1]); //���\�b�h�̒ǉ�
			}
			fileReader.close();
			
			//entrySet():�L�[�ƃZ�b�g�̃G���g���[���擾����
			for(Map.Entry<String,String>e:map.entrySet()) {
				System.out.println(e.getKey()+":"+e.getValue());
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
