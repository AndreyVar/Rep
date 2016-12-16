package OOP_2;

public class Rez {

	public static void main(String[] args) {
		
		float rez = 0;

		Triangle t = new Triangle ();
		Circle c = new Circle ();
		
		t.setData(0, 0, 2, 3, 63);
		c.setData(10, 10, 3);
		
		rez = t.area();
		System.out.println("Площа трикутника: " + rez);
		
		t.scale(7);
		rez = t.area();
		System.out.println("Площа зміненого трикутника: " + rez);
		
		t.scale(4, 5, 0);
		rez = t.area();
		System.out.println("Площа вдруге зміненого трикутника: " + rez);
		
		rez = c.area();
		System.out.println("Площа круга: " + rez);
		
		c.scale(3);
		rez = c.area();
		System.out.println("Площа зміненого круга: " + rez);
		
		t.setData(5, 5, 4, 5, 60);
		rez = t.area();
		System.out.println("Площа нового трикутника: " + rez);
		
		c.setData(0, 0, 7);
		rez = c.area();
		System.out.println("Площа нового круга: " + rez);
	}
}