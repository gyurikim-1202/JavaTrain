package t20230415;
// Float과 Double 타입의 소수 이하 유효 자릿수 확인
// Double 타입은 Float 타입보다 약 2배의 유효 자릿수를 가짐(더 정확한 데이터 저장 가능)
public class FloatDoubleExample {

	public static void main(String[] args) {
		//정밀도 확인
		float var1 = 0.12312312312312312f;
		double var2 = 0.12312312312312312;
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		
		//10의 거듭제곱 리터럴
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5 = 2e-3;
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);

	}

}
