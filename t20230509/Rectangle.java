package t20230509;
//사각형
public class Rectangle implements Plan2D {
	private int width;  //너비
	private int height;  //높이
	
	public Rectangle(int width, int height) {
		this.width = width; this.height = height;
	}
	
	public String toString() {  //문자열 표현
		return "Rectangle(width:" + width + ", height:" + height + ")";
	}
	
	public void draw() {  //그리기
		for (int i = 0; i <= height; i++) {
			for (int j = 0; j < width; j++)
				System.out.print('*');
				System.out.println();
		}
	}
		public int getArea() {return width * height;}  //면적 구하기
}
