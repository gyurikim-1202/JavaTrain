package t20230415;
// 변수를 문자열과 결합 후 출력하거나 연산식에서 활용
public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");

	}

}
