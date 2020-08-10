package a20_08_05;

class car{
	protected String model;
	protected String color;
	public car() {}
	public car(String model,String color) {
		this.model=model;
		this.color=color;
	}
	public void show() {
		System.out.println("¸ðµ¨¸í="+model+",Ä®¶ó="+color);
	}
}
class Taxi extends car{
	protected boolean Taximeter;
	protected int Taxifare=3300;
	public Taxi() {
		super();
	}
	
	public Taxi(boolean taximeter, int taxifare) {
		super();
		Taximeter = taximeter;
		Taxifare = taxifare;
	}

	public Taxi(String model, String color) {
		super(model, color);
	}
	public Taxi(String model, String color, boolean taximeter, int taxifare) {
		super(model, color);
		Taximeter = taximeter;
		Taxifare = taxifare;
	}
	public void show() {
		System.out.println("ÅÃ½Ã¸ÞÅ¸±â:"+Taximeter+" Ä®¶ó:"+Taxifare);
	}
}

public class TaxiTest {
	public static void main(String[] args) {
		Taxi t=new Taxi();
		t.show();
		Taxi t2=new Taxi(true, 3300);
		t2.show();
		
		car c2=new car("¸ð´×", "Èò»ö");
		c2.show();
		car c4=new Taxi("¼Ò³ªÅ¸","È¸»ö",true, 3300);
		c4.show();
	}
}
