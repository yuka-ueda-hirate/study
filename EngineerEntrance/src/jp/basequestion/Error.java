package jp.basequestion;

public class Error {

	public static void main(String[] args) throws Exception{
		// �v���O�������ŁA�ȉ��̗�O�𔭐������鏈�����L�q���A���̗�O�̏ڍ׏����o�͂���
		//�@Null�Q�Ƃɂ��NullPointerException
		try{
			String name = null;
			name = name.substring(0); //���̂̑������������substring���\�b�h���Ăяo����Ă���
		}catch(Exception ex){
			ex.printStackTrace();
		}
		// �z��͈̔͊O�Q�Ƃɂ��ArrayIndexOutOfBoundsException
		try {
			String values[] = new String[2]; //��`�����v�f����2�ivalues[0],values[1])
			values[2] = "value"; //�����ŎQ�Ƃ��Ă���̂͒�`���Ă��Ȃ�values[2]
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		//�@�݊����̂Ȃ��I�u�W�F�N�g�^�̕ϊ��ɂ��ClassCastException
		try {
			Object value = "value"; //�I�u�W�F�N�g�^��String�^
			Integer number = (Integer)value; //�R���p�C���G���[�ɂ͂Ȃ�Ȃ����A���s���Ɋi�[����Ă���^��String��Integer�ɕϊ������Exception����
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
