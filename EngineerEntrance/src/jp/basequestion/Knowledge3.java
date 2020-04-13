package jp.basequestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Knowledge3 {

public static final String Path = "C:\\Users\\yuka_ueda\\Documents\\�Ɩ�\\2020�Ɩ�\\Java�w�K\\JavaStudy\\EngineerEntrance\\";
	public static void main(String[] args) {
		/*
		 * java.util�p�b�P�[�W Map�̗��p
		 * ---Map��List�̈Ⴂ-----------------------------------------
		 * | Map:key��value��ێ��B�֘A�t���ČĂяo���\�B��key�̏d���s��          |
		 * | List:�C���f�b�N�X�ԍ���ێ��B�\�[�g�\�B                                                      |
		 * --------------------------------------------------------
		 * �e�L�X�g�t�@�C���ɋL�q���ꂽ���e��1�s����Map�Ɋi�[���A�ȉ��̏������s��
		 * �Z1�s�ڂɂ́A�󔒋�؂�2�̕����񂪋L�q����Ă���A�P�ڂ��L�[�A�Q�ڂ�l�Ƃ���Map�Ɋi�[
		 * �Z�S�ẴL�[�ƒl���o��
		 * �Z�w��̃L�[���o�͂���
		 * �Z�e�L�X�g�t�@�C����UTF-8�`���ŋL�q���ꂽ����
		 * �Z���s�R�[�h��CRLF���g�p
		 */
		try {
			String targetPath = Path + "sample2.txt";
			File file = new File(targetPath); //�e�L�X�g�t�@�C���Ǎ�
			FileReader fileReader = new FileReader(file);
			BufferedReader buff = new BufferedReader(fileReader);
			
			String text;
			Map<String,String> map = new HashMap<String,String>();
			
			while((text = buff.readLine()) != null) {
				String[] value = text.split(" ");
				map.put(value[0], value[1]); //���\�b�h�̒ǉ�
			}
			fileReader.close();
			
			//entrySet():�L�[�ƃZ�b�g�̃G���g���[���擾����
			for(Map.Entry<String,String>e:map.entrySet()) {
				System.out.println(e.getKey()+":"+e.getValue());
			}
			String value = map.get("�o�g");
			if(value != null) {
				System.out.println("�o�g��" + value);
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
