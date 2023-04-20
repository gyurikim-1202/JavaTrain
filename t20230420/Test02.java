package t20230420;
// 0.0부터 1.0까지 0.001 단위로 증가시켜 가며 표시
public class Test02 {

	public static void main(String[] args) {
		System.out.println("float         int");
		System.out.println("------------------");
		
		float x = 0.0F; //x는 0.0형식의 실수
		for (int i=0; i<=1000; i++, x += 0.001F) //i초기값0, 범위:i는1000이하, 0.001단위로 x 증가시킴
		System.out.printf("%9.7f     %9.7f\n", x, (float)i / 1000); // nnn.nnnnnnn (공백) nnn.nnnnnnn 형식, x 출력, 
		//printf: 출력하는 값이 2개라면 지시자도 2개를 사용해야 하며, 출력될 값과 지시자의 순서는 일치해야 함. 개수 제한 없음
			
	}

}
