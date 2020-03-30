package test;

public class ClassB extends ClassA {
	private int b = 0;

	public ClassB() {
		b = 8;
	}

	public ClassB(int a, int b) {
		super(a);
		this.b = b;
	}



public static void main(String[] args) {
	ClassB bObject1 = new ClassB();
	ClassB bObject2 = new ClassB(3, 4);
	
	System.out.println(bObject1);
	System.out.println(bObject2);
}
}