package a20_08_05;

public class Rectangle extends Shape {
	private int w,h;
	public double area() {
		res=w*h;
		return res;
	}
	public void show() {
		System.out.println("»ç°¢Çü³ĞÀÌ:"+res);
	}
	public void setW(int w) {
		this.w = w;
	}
	public void setH(int h) {
		this.h = h;
	}
}
