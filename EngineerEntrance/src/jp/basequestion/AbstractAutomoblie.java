package jp.basequestion;
/*
 * abstract�F���ۃN���X(��`���邱�ƁF���ۉ�)
 * ���ꂾ������Ӗ��Ȃ��B�T�u�N���X�Ōp������ď��߂ĈӖ�������B
 * ���ۃ��\�b�h�Ƃ�...------------------------------------
 * | abstract class �N���X��{                          
 * | 	abstract �߂�l�̌^�@���\�b�h��(�����̌^�@����);       
 * | }   
 * | �������������Ȃ�                                           
 * -------------------------------------------------
 * �|�C���g
 * �@�p�������T�u�N���X�ł́A�I�[�o�[���C�h���K�{
 * �A�T�u�N���X�ŃR���X�g���N�^���L�q
 * �B���ڃC���X�^���X���͕s��
 * �C���d�p���͕s��
 */
public abstract class AbstractAutomoblie {
	
	//�Ԏ�敪
	protected enum CarType {
		LIGHT_CAR, //�y������
		STANDERD_CAR,  //���ʎ�
		MEDIUM_CAR, //���^��
		LARGE_CAR, //��^��
		OVERSIZE  //�����
	}
	
	//�R���g���N�^
	protected AbstractAutomoblie() {
		
	}

	/**
	 * �R���X�g���N�^
	 * @param carType�@�Ԏ�敪
	 */
	protected AbstractAutomoblie(CarType carType) {
		this.setCarType(carType);
	}
	
	//�Ԏ�敪
	private CarType carType;
	
	
	/**
	 * @return ��Ԑl��
	 */
	public abstract int getCapacity();
	
	/**
	 * @return �Ԏ�i���f���j
	 */
	public abstract String getCarModel();
	
	
	/**
	 * @return �Ԏ�敪
	 */
	public CarType getCarType() {
		return carType;
	}
	
	/**
	 * @param carType �Ԏ�敪
	 */
	public void setCarType(CarType carType) {
		this.carType = carType;
	}
	
	public String getCarTypeString() {
		String typeName = "";
		if(this.carType.equals(CarType.LIGHT_CAR)) {
			typeName = "�y������";
		}else if(this.carType.equals(CarType.STANDERD_CAR)) {
			typeName = "���ʎ�";
		}else if(this.carType.equals(CarType.MEDIUM_CAR)) {
			typeName = "���^��";
		}else if(this.carType.equals(CarType.LARGE_CAR)) {
			typeName = "��^��";
		}else if(this.carType.equals(CarType.OVERSIZE)) {
			typeName = "�����";
		}
		return typeName;
	}
}
