package t20230511;

import java.util.Scanner;

//배열의 요소에 값을 읽어서 반대로 나열한다. (오류 있는 프로그램)
class ReverseArray2 {
	//배열의 요소 a[idx1]와 a[idx2]를 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	//배열 a의 요소를 반대로 나열(오류)
	static void reverse(int[] a) {
		try {
			for (int i = 0; i < a.length / 2; i++)
				swap(a, i, a.length - i);
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요소 수: ");
		int num = stdIn.nextInt(); //요소 수
		int[] x = new int[num];  //요소 수 num의 배열
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		reverse(x);
		
		System.out.println("요소를 반대로 나열했습니다.");
		for(int i = 0; i < num; i++)
		System.out.println("x[" + i + "] = " + x[i]);
	}

}
