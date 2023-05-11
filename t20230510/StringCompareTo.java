package t20230510;

import java.util.Scanner;

//두 문자열의 대소 관계를 판정하는 프로그램
public class StringCompareTo {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("문자열 s1: "); String s1 = stdIn.next();
		System.out.print("문자열 s2: "); String s2 = stdIn.next();
		
		int balance = s1.compareTo(s2);
		if (balance < 0)
			System.out.println("s1이 작다.");
		else if (balance > 0)
			System.out.println("s2가 작다.");
		else
			System.out.println("s1과 s2가 같다.");
	}
}

//compareTo 메서드: 다른 문자열과의 대소 관계 판정
//변수명.compareTo(s)
//주어진 문자열이 문자열 s보다 사전적으로 앞에 있으면 음수 반환, 뒤에 있으면 양수 반환, 같은 경우는 0 반환
//동일 인덱스상에 위치하는 문자가 모두 같은 경우
//짧은 문자열이 사전적으로 앞에 있다고 판단 -> 문자열 길이의 차이, 즉 this.length() - s.length()를 반환함
