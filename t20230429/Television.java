package t20230429;

public class Television {
	static String company = "MyCompany";  //선언 시 초기값을 줌
	static String model = "LCD";  //선언 시 초기값을 줌
	static String info;
	
	//정적 블록에서 company와 model을 연결해 info의 초기값으로 줌
	static {
		info = company + "-" + model;
	}

}
