package OOP;

class B extends A {
	
	private double d;
	
	public B (int a, int b, int c, double d) {
		super(a, b, c);
		this.d = d;
	}
	
	public double add (int a, int b, int c, double d) {
		double sum = a + b + c + d + this.d;
		return sum;
	}
}