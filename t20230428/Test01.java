package t20230428;
//사람 클래스(ver.1)
class Humans {
	String name;  //이름
	int height;   //신장
	int weight;   //체중
}

class Test01 {
	public static void main(String[] args) {
		Humans gildong = new Humans();
		Humans chulsu= new Humans();
		
		gildong.name = "길동";
		gildong.height = 170;
		gildong.weight = 60;
		
		chulsu.name = "철수";
		chulsu.height = 166;
		chulsu.weight = 72;
		
		System.out.println("이름: " + gildong.name);   //gildong의 데이터를 표시
		System.out.println("신장: " + gildong.height + "cm");
		System.out.println("체중: " + gildong.weight + "kg");
		System.out.println();
		
		System.out.println("이름: " + chulsu.name);  //chulse의 데이터 표시
		System.out.println("신장: " + chulsu.height + "cm");
		System.out.println("체중: " + chulsu.weight + "kg");

	}

}
