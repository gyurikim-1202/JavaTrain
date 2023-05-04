package t20230504;
//자동차 클래스(총 주행 거리 추가)
public class ExCar extends Car {
	private double totalMileage;  //총 주행 거리
	
	//---생성자---//
	public Excar(String name, int width, int height, int length, double fuel,
	Day purchaseDay) {
		super(name, width, height, length, fuel, purchaseDay);
	}

}
