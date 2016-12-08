package OOP;

class A implements In {
	
	private int a, b, c;

	public A (int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	private int a () {
		return this.a * 10;
	}
	
	private int b () {
		return this.b * 10;
	}
	
	private int c () {
		return this.c * 10;
	}
	
	int add () {
		int sum = a() + b() + c();
		return sum;
	}
	
	public int add (int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}
}
