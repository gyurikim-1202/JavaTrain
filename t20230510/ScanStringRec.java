package t20230510;

import java.util.Scanner;

//문자열을 한 문자씩 역순으로 표시
public class ScanStringRec {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
				
		System.out.println("문자열: ");
		String s = stdIn.next();
		
		System.out.print("반대로 읽으면 ");
		for (int i = s.length() -1; i >= 0; i--)
			System.out.print(s.charAt(i));
			System.out.println("입니다.");

	}

}
