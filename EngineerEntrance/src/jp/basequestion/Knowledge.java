package jp.basequestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Knowledge {

public static final String Path = "C:\\Users\\yuka_ueda\\Documents\\�Ɩ�\\2020�Ɩ�\\Java�w�K\\JavaStudy\\EngineerEntrance\\";
	public static void main(String[] args) {
		/*
		 * java.io�p�b�P�[�W�E�e�L�X�g�t�@�C�����o��
		 * �e�L�X�g�t�@�C���ɋL�q���ꂽ���e��\�����A�قȂ�t�@�C���ɏo�͂���v���O�������쐬
		 * �Z�ǂݍ��ރt�@�C�����A�o�͂���t�@�C�����A��������擾
		 * �Z�e�L�X�g�t�@�C����UTF-8�`���ŋL�q���ꂽ����
		 * �Z���s�R�[�h��CRLF���g�p
		 */
		try {
			String targetPath = Path + "sample.txt";
			File file = new File(targetPath); //�e�L�X�g�t�@�C���Ǎ�
			FileReader fileReader = new FileReader(file);
			BufferedReader buff = new BufferedReader(fileReader);
			
			String outPutPath = Path + "outPut.txt";
		    FileWriter writer = new FileWriter(outPutPath);//�e�L�X�g�t�@�C���̏o��
			String text;
			while((text = buff.readLine()) != null) {
				writer.write(text);
				writer.write("\r\n");
				//System.out.println(text);
				//System.out.println("\r\n");
			}
			writer.close();
			buff.close();
			fileReader.close();
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
