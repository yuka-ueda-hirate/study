package jp.basequestion;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/*
 * �C���^�[�t�F�C�X�����Ƃ́F�v���O�����̎����������������A���̎��������N���X�ɂ��̎��̂�����
 * �C���^�[�t�F�C�X�N���X�ł̓��\�b�h�̌^(������߂�l�̒l�̌^�j�݂̂��w��˒��ۃ��\�b�h
 * ���ۃN���X��abstract�̋L�q�͕K�{�˃C���^�[�t�F�C�X�ł͑S�Ē��ۃ��\�b�h�̂��ߋL�q�͕s�v
 * Comparator�C���^�[�t�F�C�X...compare():�ǂ��炪�傫�����@equals():���������ǂ��� �����̓�̃��\�b�h��p�ӂ���
 */

//String�z����r���郋�[�����߂�
public class TemperatureComparator implements Comparator<String[]>{
	
	@Override
	public int compare(String[] o1, String[] o2) {
		//�ō��C����r
		int maxTemp1 = (int)(Double.parseDouble(o1[1])*10);
		int maxTemp2 = (int)(Double.parseDouble(o2[1])*10);
		if(maxTemp1 < maxTemp2) {
			return 1;
		}else if(maxTemp1 > maxTemp2) {
			return -1;
		}else {
			//�Œ�C����r
			int minTemp1 = (int)(Double.parseDouble(o1[2])*10);
			int minTemp2 = (int)(Double.parseDouble(o2[2])*10);
			if(minTemp1 < minTemp2) {
				return 1;
			}else if(minTemp1 > minTemp2){
				return -1;
			}else {
				//���ϋC��
				int avgTemp1 = (int)(Double.parseDouble(o1[3])*10);
				int avgTemp2 = (int)(Double.parseDouble(o2[3])*10);
				if(avgTemp1 < avgTemp2) {
					return -1;
				}else if(avgTemp1 > avgTemp2){
					return 1;
				}else {
					//���t���r
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
					try {
						Date date1 = sdf.parse(o1[0]);
						Date date2 = sdf.parse(o2[0]);
						if(date1.before(date2)) {
							return 1;
						}else {
							return 0;
						}
					}catch(ParseException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return 0;
	}
}