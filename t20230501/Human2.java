package t20230501;
//사람 클래스 3
class Human2 {
	private String name;  //이름
	private int height;  //신장
	private int weight;  //체중
	private Day birthday; //생일
	
	//---생성자---//
	public Human2(String name, int height, int weight, Day birhday) {
		this.name = name; this.height = height;
		this.weight = weight; this.birthday = new Day(birhday);
	}
	
	public String getName() { return name; }  //이름 가져오기
	public int getHeight() { return height; }  //신장 불러오기
	public int getWeight() { return weight; }  //체중 불러오기
	public Day getBirthDay() { return new Day(birthday); }  //생일 불러오기
	
	public void gainWeight(int w) { weight += w; }  //살이 찐다
	public void reduceWeight(int w) { weight -= w; } //살이 빠진다
	
	//---데이터 표시---//
	public void putData() {
		System.out.println("이름: " + name);
		System.out.println("신장: " + "cm");
		System.out.println("체중: " + "kg");
	}
	
	//---문자열화---//
	public String toString() {
		return "{" + name + ": " + height + "cm " + weight + "kg "
				+ birthday + "출생}";
	}
}
