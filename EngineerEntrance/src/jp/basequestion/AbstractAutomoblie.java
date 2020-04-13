package jp.basequestion;
/*
 * abstract：抽象クラス(定義すること：抽象化)
 * これだけじゃ意味ない。サブクラスで継承されて初めて意味がある。
 * 抽象メソッドとは...------------------------------------
 * | abstract class クラス名{                          
 * | 	abstract 戻り値の型　メソッド名(引数の型　引数);       
 * | }   
 * | ※実装を持たない                                           
 * -------------------------------------------------
 * ポイント
 * ①継承したサブクラスでは、オーバーライドが必須
 * ②サブクラスでコンストラクタを記述
 * ③直接インスタンス化は不可
 * ④多重継承は不可
 */
public abstract class AbstractAutomoblie {
	
	//車種区分
	protected enum CarType {
		LIGHT_CAR, //軽自動車
		STANDERD_CAR,  //普通車
		MEDIUM_CAR, //中型車
		LARGE_CAR, //大型車
		OVERSIZE  //特大車
	}
	
	//コントラクタ
	protected AbstractAutomoblie() {
		
	}

	/**
	 * コンストラクタ
	 * @param carType　車種区分
	 */
	protected AbstractAutomoblie(CarType carType) {
		this.setCarType(carType);
	}
	
	//車種区分
	private CarType carType;
	
	
	/**
	 * @return 乗車人数
	 */
	public abstract int getCapacity();
	
	/**
	 * @return 車種（モデル）
	 */
	public abstract String getCarModel();
	
	
	/**
	 * @return 車種区分
	 */
	public CarType getCarType() {
		return carType;
	}
	
	/**
	 * @param carType 車種区分
	 */
	public void setCarType(CarType carType) {
		this.carType = carType;
	}
	
	public String getCarTypeString() {
		String typeName = "";
		if(this.carType.equals(CarType.LIGHT_CAR)) {
			typeName = "軽自動車";
		}else if(this.carType.equals(CarType.STANDERD_CAR)) {
			typeName = "普通車";
		}else if(this.carType.equals(CarType.MEDIUM_CAR)) {
			typeName = "中型車";
		}else if(this.carType.equals(CarType.LARGE_CAR)) {
			typeName = "大型車";
		}else if(this.carType.equals(CarType.OVERSIZE)) {
			typeName = "特大車";
		}
		return typeName;
	}
}
