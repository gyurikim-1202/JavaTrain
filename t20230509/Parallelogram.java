package t20230509;
//평행사변형
public class Parallelogram implements Plan2D {
	private int width;  //밑변의 너비
	private int height;  //높이
	
	public Parallelogram(int width, int height) {
		this.width = width; this.height = height;
	}
	
	public String toString() {  //문자열 표현
		return "Parallelogran(width:" + width + ", height:" + height + ")";
	}
	public void draw() {  //그리기
		for (int i = 0; i <= height; i++) {
			for (int j = 0; j <= height - i	; j++) System.out.print(' ');
			for (int j = 0; j <= width; j++) System.out.print('#');
			System.out.println();
		}
	}
	public int getArea() { return width * height; } //면적 구하기
}
