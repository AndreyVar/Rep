package OOP;

class C extends B implements InC {
	
	private int a, b, c;
	private double d;
	private float f;
		
	public C (int a, int b, int c, double d, float f) {
		super(a, b, c, d);
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.f = f;
	}
	
	public int add () {
		int sum = this.a + this.b * 7 + this.c * 3 + (int) this.d * 9 + (int) this.f * 8;
		return sum;
	}
	
	public double add (double a, double b, float c, double d, double f) {
		double sum = a + b + c + d + f;
		return sum;
	}
	
	public float add (float a, float b, int c, float d, float f) {
		float sum = a + b + c + d + f;
		return sum;
	}
	
	public float add (int a, int b, int c, int d, int f) {
		return a + b + c + d + f;
	}
}
