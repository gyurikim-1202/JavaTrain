package t20230501;
//은행 계좌 클래스 (ver.1)
class Account수정전 {
	private String name; //계좌 명의
	private String no; //계좌 번호
	private long balance; //예금 잔고
	private Day openDay; //계좌 개설일
	
	//---생성자---//
	public Account수정전(String n, String num, long z, Day d) {
		name = n; //계좌 명의
		no = num; //계좌 번호
		balance = z; //예금 잔고
		openDay = new Day(d); //계좌 개설일
	}
	
	//---계좌 명의 확인---//
	String getName() {
		return name;
	}
	
	//---계좌 번호 확인---//
	String getNo() {
		return no;
	}
	
	//---예금 잔고 확인---//
	long getBalance() {
		return balance;
	}
	
	//---계좌 개설일 확인---//
	public Day getOpenDay() {
		return new Day(openDay);
	}
	
	//---k원 출금---//
	void withdraw(long k) {
		balance -= k;
	}

}
