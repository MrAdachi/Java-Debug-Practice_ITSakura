package debug;

interface InterfaceA {
	public static final int weight = 10;
	
	public abstract void method1();
}

interface InterfaceB {
	public static final double height  = 100.5;
	
	public abstract void method2();
}

interface InterfaceC extends InterfaceA, InterfaceB {
	public abstract void method3();
}

class Test1 implements InterfaceC {
	public void method1() {
		System.out.println(weight);
	}
	public void method2() {
		System.out.println(height);
	}
	public void method3() {
		System.out.println("method3");
	}
	public String method4(String s) {
		this.method1();
		this.method2();
		this.method3();
		return s;
	}
}

public class DebugPractice1 {
	public static void main(String[] args) {
		int a = 1;
		int b = a + 1;
		
		Test1 t = new Test1();
		
		String c = t.method4("Test");
		String d = b + c;
		System.out.println(d);
	}

}
