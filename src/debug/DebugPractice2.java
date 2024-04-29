package debug;

abstract class Abs2 {
	int weight;
	
	abstract void method1();
}

class Sub2 extends Abs2 {
	
	Sub2(int w) {
		super.weight = w;
	}
	
	void method1() {
		
		if(super.weight > 80) {
			System.out.println("あなたの体重は" + super.weight + "kgなので、痩せましょう");
		} else if (super.weight > 60) {
			System.out.println("あなたの体重は" + super.weight + "kgなので、いい感じです");
		} else {
			System.out.println("あなたの体重は" + super.weight + "kgなので、痩せすぎです");
		}
	}
}

public class DebugPractice2 {
	public static void main(String[] args) {
		int w1 = 90;
		Sub2 tanaka = new Sub2(w1);
		tanaka.method1();
		
		int w2 = 80;
		Sub2 suzuki = new Sub2(w2);
		suzuki.method1();
		
		int w3 = 60;
		Sub2 sato = new Sub2(w3);
		sato.method1();
	}
}
