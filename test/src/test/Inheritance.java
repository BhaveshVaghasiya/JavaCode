package test;

public class Inheritance extends Super{

	public Inheritance(String txt) {
		i=2;
	}
	
	public static void main(String args[]) {
		Inheritance itr = new Inheritance("hello");
		System.out.println(itr.i);
	}

}
