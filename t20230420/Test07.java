package t20230420;
//요소 개수가 5인 double형 배열을 만들고 앞에서부터 1.1, 2.2, 3.3., 4.4, 5.5를 대입해서 표시하는 프로그램
public class Test07 {

	public static void main(String[] args) {
		double[] a = new double[5]; //배열 선언
		
		for (int i=0; i<a.length; i++)
			a[i] = (i+1) * 1.1;
		
		for (int i=0; i<a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);

	}

}
