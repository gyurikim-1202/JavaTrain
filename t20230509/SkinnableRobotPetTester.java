package t20230509;
//스킨 변경 가능한 로봇 애완견형 클래스 사용 예
public class SkinnableRobotPetTester {
	//p가 참조하는 인스턴스에 자기 소개를 시킨다
	static void intro(Pet p) {
		p.introduce();
	}
	public static void main(String[] args) {
		Pet[] a = {
				new Pet("Kurt", "아이"),
				new RobotPet("R2D2", "루크"),
				new SkinnableRobotpet("0SX5", "Apple", Skinnable.YELLOW),
				new Pet("마이클", "영남"),
		};
		
		for (Pet p : a) {
			intro(p); //p가 참조하는 인스턴스에 자기 소개를 시킨다
			//p의 참조 대상이 SkinnableRobotPet이면
			if (p instanceof SkinnableRobotpet) {
				System.out.print("스킨은 ");
				((SkinnableRobotpet)p).printSkin();
				System.out.println("입니다.");
			}
			System.out.println();
		}
	}
}
