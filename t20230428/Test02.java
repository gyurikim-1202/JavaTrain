package t20230428;
class Human {
	private String name; //이름
	private int height; //신장
	private int weight; //체중
	
	//---생성자---//
	Human(String n, int h, int w){
		name = n; height = h; weight = w;
	}
	
	String getName() {return name;}   //이름 가져오기
	int getHeight() {return height;}  //신장 불러오기
	int getWeight() {return weight;}  //체중 불러오기
	
	void gainWeight(int w) {weight += w;}  //살이 찐다.
	void reduceWeight(int w) {weight -= w;}  //살이 빠진다.
}

public class Test02 {

	public static void main(String[] args) {
		Human gildong = new Human("길동", 170, 60);
		Human chulsu = new Human("철수", 166, 72);
		
		gildong.gainWeight(3);  //길동이 3kg 쪘다.
		chulsu.reduceWeight(5);  //철수가 5kg 빠졌다.
		
		System.out.println("이름: " + gildong.getName());
		System.out.println("신장: " + gildong.getHeight() + "cm");
		System.out.println("체중: " + gildong.getWeight() + "kg");
		System.out.println();
		
		System.out.println("이름: " + chulsu.getName());
		System.out.println("신장: " + chulsu.getHeight() + "cm");
		System.out.println("체중: " + chulsu.getWeight() + "kg");
	}
}
