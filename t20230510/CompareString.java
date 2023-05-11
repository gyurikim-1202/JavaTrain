package t20230510;

import java.util.Scanner;

//입력한 2개 문자열이 같은지 비교하는 프로그램
public class CompareString {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("문자열 s1: "); String s1 = stdIn.next();
		System.out.print("문자열 s2: "); String s2 = stdIn.next();
		
		if (s1 == s2)
			System.out.println("s1 == s2입니다.");
		
		//입력된 인스턴스들은 별도로 생성되므로, 동일한 문자열을 입력해도 s1 != s2가 된다.
		else
			System.out.println("s1 != s2입니다.");
		
		if (s1.equals(s2))
			System.out.println("s1과 s2의 내용이 같습니다.");
		else
			System.out.println("s1과 s2의 내용이 다릅니다.");
	}

}
