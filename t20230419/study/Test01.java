package t20230419.study;

import java.util.Scanner;

//정숫값을 그룹별로 읽어서 합산(정수 5개 X 10그룹)
// 99999: 전체 입력 종료, 88888: 현재 읽고 있는 그룹의 입력 종료
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in); //scanner 불러오기
		
		System.out.println("정수를 더합니다."); //텍스트 출력
		int total = 0; //매개변수 total 값 초기화 / total은 전체 그룹의 합계
		
		Outer: //이거 뭔데?
			for (int i=1; i<=10; i++) {
				System.out.println(i + "그룹");
				
				for (int j=0; j<5; j++) {
					System.out.print("정수: ");
					int t = stdIn.nextInt();
					
					if(t == 99999) {
						break Outer;
					} else if(t == 88888) 
					continue Outer;	 // 이 if문만 빠져나가고 outer 계석
				total += t;
				}
			}
		System.out.println("\n합계는 " + total + "입니다.");
	}

}


// 안내 텍스트 입력 > 합계 변수 total 선언(=0;) > for문 -> for문1: "n그룹"
// -> for문2("정수: ") -> sum += -> "합계는 totla~"