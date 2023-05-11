package t20230511;
//이전 프로그램의 실행, 종료 날짜 및 시간 표시 프로그램

import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.GregorianCalendar;

public class LastTime {
	//이전 날짜, 시간 읽기
	static void init() {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("LastTime.txt"));
			String time = br.readLine();
			System.out.println("이전 시간은 " + time + "였습니다.");
		} catch (IOException e) {
			System.out.println("이 프로그램을 실행하는 것은 처음입니다.");
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("파일 닫기 실패.");
				}
			}
		}
	}
	
	//현재 날짜, 시간 읽기
		static void term() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("LastTime.txt");
			GregorianCalendar c = new GregorianCalendar();  //현재 날짜, 시간
			fw.write((String.format("%04d년 %02d월 %02d일 %02d시 %02d분 %02d초",					
					c.get(YEAR), c.get(MONTH) + 1, c.get(c.DATE),
					c.get(c.HOUR_OF_DAY), c.get(c.MINUTE), c.get(c.SECOND))));
		} catch (IOException e) {
			System.out.println("오류 발생!");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					System.out.println("파일 닫기 실패.");
				}
			}
		}

	}

		public static void main(String[] args) {
			init();  //이전 날짜, 시간 읽기
			term();  //현재 날짜, 시간 기록
		}
}
