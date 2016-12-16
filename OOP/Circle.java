package OOP_2;

class Circle extends Figure {
	
	private float x, y, radius;
	
	public void setData (float x, float y, float radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public float getX() {
		return this.x;
	}
	
	@Override
	public float getY() {
		return this.y;
	}
	
	public float getRadius() {
		return this.radius;
	}
	
	@Override
	public void scale(float a) {
		this.radius = this.radius * a;
	}
	
	@Override
	public float area() {
		float area = (float) Math.PI * this.radius * this.radius;
		return area;
	}

}
