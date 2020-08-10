package a20_08_05;

public class Triangle extends Shape {
	private int w,h;
	public double area() {
		res=(w*h)/2.0;
		return res;
	}
	public void setW(int w) {
		this.w = w;
	}
	public void setH(int h) {
		this.h = h;
	}
	public void show() {
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ:"+res);
	}
}
