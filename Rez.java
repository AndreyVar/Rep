package OOP;

public class Rez {

	public static void main(String[] args) {

		A a = new A(1, 2, 3);
		B b = new B(1, 2, 3, 4.0);
		C c = new C(1, 2, 3, 4.0, 5.0f);
		
		int i;
		double d;
		
		i = a.add();
		d = b.add(11, 22, 33, 44);
		System.out.println("i = " + i + "\n" + "d = " + d);
		d = c.add();
		System.out.println("d = " + d);
		d = c.add(2, 3, 4);
		System.out.println("d = " + d);
		d = c.add(3, 4, 5, 6);
		System.out.println("d = " + d);
		d = b.add();
		System.out.println("d = " + d);
		d = b.add(5, 6, 7, 8);
		System.out.println("d = " + d);
		d = b.add(3, 7, 8);
		System.out.println("d = " + d);
		d = c.add(2, 3, 4, 5, 6);
		System.out.println("d = " + d);
		d = c.add(3, 4, 5, 6, 7);
		System.out.println("d = " + d);
		d = c.add(5, 2, 3, 7, 1);
		System.out.println("d = " + d);
		
	}

}
