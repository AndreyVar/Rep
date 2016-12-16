package OOP_2;

class Triangle extends Figure {

	private float x, y, a, b, c, ab, bc, ca;
	
	public void setData (float x, float y, float a, float b, float ab) {
		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;
		this.ab = (float) Math.toRadians(ab);
		
		this.c  = (float) Math.sqrt( (this.a * this.a) + (this.b * this.b) - (2 * this.a * this.b * Math.cos(this.ab)) );
		this.bc = (float) Math.asin( (this.a * Math.sin(this.ab)) / this.c );
		this.ca = (float) Math.asin( (this.b * Math.sin(this.ab)) / this.c );
	}
	
	@Override
	public float getX() {
		return this.x;
	}
	
	@Override
	public float getY() {
		return this.y;
	}
	
	public float getA() {
		return this.a;
	}
	
	public float getB() {
		return this.b;
	}
	
	public float getC() {
		return this.c;
	}
	
	public float getAb() {
		return this.ab;
	}

	public float getBc() {
		return this.bc;
	}

	public float getCa() {
		return this.ca;
	}
	
	@Override
	public float area () {
		float area = (float) (this.a * this.b * Math.sin(this.ab));
		return area;
	}
	
	public void scale (float a, float b, float ab) {
		this.a = this.a + a;
		this.b = this.b + b;
		this.ab = this.ab + ab;
	}
	
	@Override
	public void scale (float a) {
		this.a = this.a * a;
		this.b = this.b * a;
		this.ab = this.ab * a;
	}
	
}
