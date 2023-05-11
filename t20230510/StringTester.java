package t20230510;
//문자열과 null 참조, 빈 문자열, 다른 String형 변수가 참조하는 문자열을 참조
public class StringTester {

	public static void main(String[] args) {
		String s1 = null;  //null참조(참조하지 않는다)
		String s2 = "";  //""을 참조
		String s3 = "ABC";	///"ABC"를 참조
		String s4 = "ABC";	///"ABC"를 참조
		String s5 = "ABC";	///"ABC"를 참조
		s5 = "XYZ";
		
		System.out.println("문자열 s1 = " + s1);
		System.out.println("문자열 s2 = " + s2);
		System.out.println("문자열 s3 = " + s3);
		System.out.println("문자열 s4 = " + s4);
		System.out.println("문자열 s5 = " + s5);
		System.out.println("s3와 s4는 같은 문자열 리터럴을 참조" +
							((s3 == s4) ? "하고 있다" : "하고 있지 않다."));
		
		System.out.println("----------");
		//System.out.println("문자열 s1의 길이 = " + s1.length()); //오류 발생함
		System.out.println("문자열 s2의 길이 = " + s2.length()); //값 = 0
	}
}

//이 프로그램에서 String형 변수는 명시적으로 생성자를 호출하지 않고 초기화한다.