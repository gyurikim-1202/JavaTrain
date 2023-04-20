package t20230419.study;

public class CharAtExample {

	public static void main(String[] args) {
		String ssn = "9506241230123"; // 문자 데이터 ssn 값 정의
		char sex = ssn.charAt(6); // sex값은 ssn의 6번째 문자
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다."); // sex(ssn의 6번째 문자)가 1or3이면 "남자~" 출력하고 끝
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
			
		}

	}

}
