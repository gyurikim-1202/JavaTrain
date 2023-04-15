package t20230415;
//이스케이프/라인 피드 대신 큰따옴표 3개로 감싸서 문자열 저장하기
public class TextBlockExample {

	public static void main(String[] args) {
		String str1 = "" +
		"{\n" +
		"\t\"id\":\"winter\",\n" +
		"\t\"name\":\"눈송이\"n" +
		"}";
		
		String str2 = """
				{
				"id":winter",
				"name":"눈송이"
				}
				""";
		
		System.out.println(str1);
		System.out.println("---------------");
		System.out.println(str2);
		System.out.println("---------------");
		String str = """
				나는 자바를 \
				학습합니다.
				나는 자바 고수가 될 겁니다.
				""";
		System.out.println(str);

	}

}
