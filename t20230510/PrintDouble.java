package t20230510;

import java.util.Scanner;

//부동 소수점값 x에서 소수점 이하 부분 p자리로, 전체를 적어도 w자리로 표시하는 메소드
public class PrintDouble {
//부동 소수점값 표시 메소드
	static void printDouble(double x, int p, int w) {
		System.out.printf(String.format("%%%d.%df", w, p), x);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("실수값: ");
		double x = stdIn.nextDouble();
		
		System.out.print("전체 자릿수: ");
		int w = stdIn.nextInt();
		
		System.out.print("소수점 이하 자릿수: ");
		int p = stdIn.nextInt();
		
		printDouble(x, p, w);
		System.out.println();
	}
}
