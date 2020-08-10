package a20_08_05;

class A{
	
}

class B extends A{
	
}

public class C {
	public static C getC() {
		return new C();
	}
	public static void main(String[] args) {
		A akim=new A();
		B bkim=new B();
		C ckim=new C();
		C cpark=getC();
	}
}
