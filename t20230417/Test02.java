package t20230417;

import java.util.Scanner;

//읽은 갯수만큼 * 표시
public class Test02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?: ");
		int n = stdIn.nextInt();
		if (n > 0) {
			for(int i=0;  i < n; i++)
				System.out.print('*');
			System.out.println();
		}

	}

}
