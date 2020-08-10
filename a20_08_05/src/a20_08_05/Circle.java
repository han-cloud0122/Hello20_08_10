package a20_08_05;

public class Circle extends Shape {
	private int r;
	public void setR(int r) {
		this.r = r;
	}
	public double area() {
		res=r*r*Math.PI;
		return res;
	}
	public void show() {
		System.out.println("¿ø³ĞÀÌ:"+res);
	}
}
