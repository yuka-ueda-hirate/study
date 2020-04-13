package jp.basequestion;

public class Mycar extends AbstractAutomoblie{
	
	protected Mycar() {
		super(CarType.STANDERD_CAR);
	}
	
	@Override
	public int getCapacity() {
		return 7;
	}
	@Override
	public String getCarModel() {
		return "自家用ワンボックス車";
	}
}
