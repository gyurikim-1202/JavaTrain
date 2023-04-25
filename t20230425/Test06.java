package t20230425;

import java.util.Random;
import java.util.Scanner;

class Test06 {
	//---난수(a =< 난수 =<b)를 생성해서 반환하는 random 메소드 작성---//
	static int random(int a, int b) { //return값이 있으니까 void가 아니라 int 사용
		if (b <= a)
			return a;
		else {
			Random rand = new Random();
			return a + rand.nextInt(b - a + 1);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("난수를 생성합니다.");
		System.out.print("하한값: "); int min = stdIn.nextInt();
		System.out.print("하한값: "); int max = stdIn.nextInt();
		
		System.out.println("생성한 난수는 " + random(min, max) + "입니다.");

	}

}


//난수(a =< 난수 =<b)를 생성해서 반환하는 random 메소드 작성
//random 메소드 안에서 난수를 생성하는 표준 라이브러리 호출
//b<=a인 경우 a값을 그대로 반환할 것