package a20_08_05;



public class MainTest {
	public static void poly(Shape sh) {
		if(sh instanceof Circle) {
			Circle cx=(Circle) sh;
			cx.setR(5);
			cx.area();
			cx.show();
		}else if(sh instanceof Rectangle) {
			Rectangle rx=(Rectangle) sh;
			rx.setH(5);
			rx.setW(10);
			rx.area();
			rx.show();
		}else if(sh instanceof Triangle) {
			Triangle tx=(Triangle) sh;
			tx.setH(5);
			tx.setW(10);
			tx.area();
			tx.show();
		}
	}
	public static void main(String[] args) {
		poly(new Circle());
		poly(new Rectangle());
		poly(new Triangle());
	}
}
