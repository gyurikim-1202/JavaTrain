package t20230416_복습;
// 오버플로우와 언더플로우
public class T4_OverflowUnderflowExample {

	public static void main(String[] args) {
		byte var1 = 125;
		for(int i=0; i<5; i++) {	//{ }를 5번 반복 실행
			var1++;					//++연산은 var1의 값을 1 증가시킴
			System.out.println("var1: " + var1);
		}
		
		System.out.println("-------------------");
		
		byte var2 = -125;
		for(int i=0; i<5; i++) {
			var2--;
			System.out.println("var2: " + var2);
		}

	}

}
