package t20230425;

import java.util.Scanner;

class Test07 {
	static Scanner stdIn = new Scanner(System.in);
	
	//양의 정수를 읽어서 반환하는 메소드 작성
	static int readPlusInt() {
		int x;
		do {
			System.out.print("양의 정숫값: ");
			x = stdIn.nextInt();
		} while (x <= 0);
		return x;
	}

	public static void main(String[] args) {
		//양의 정숫값을 거꾸로 반환하는 실행문 작성
		int x;
		do {
			int n = readPlusInt();
			
			System.out.print("반대로 읽으면 ");
			while (n > 0) {
				System.out.print(n%10);
				n /= 10;
			}
			System.out.println("입니다.");
			
			do {
				System.out.print("다시 한번? 네-1, 아니요-2: ");
				x = stdIn.nextInt();
			} while (x !=0 && x != 1);
		} while (x == 1);
			

	}

}

//양의 정수를 읽어서 반환하는 메소드 작성
//"양의 정숫값: "이라는 메시지에 정수값을 입력하면 값을 거꾸로 반환하는 readPlusInt 메서드 작성

//입력한 정수를 거꾸로 출력하는 실행문 작성
//0이나 음수가 입력되면 재입력되도록 할 것
