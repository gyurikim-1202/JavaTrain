package t20230501;

import java.util.Scanner;

import t20230503.Account;

//은행 계좌 클래스(ver.2) 사용 예(방법2)
public class AccountTester2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("계좌 정보를 입력하세요.");
		System.out.print("명   의: ");
		String name = stdIn.next();
		System.out.print("번   호: ");
		String no = stdIn.next();
		System.out.print("잔   고: ");
		long balance = stdIn.nextLong();
		System.out.print("개설 월: ");
		int m = stdIn.nextInt();
		System.out.print("개설 일: ");
		int d = stdIn.nextInt();
		
		Account a = new Account(name, no, balance, new Day(y, m, d));
		
		System.out.println("계좌 기본 정보: " + a);
		System.out.println("개설일: " + a.getOpenDay().toString());

	}

}
