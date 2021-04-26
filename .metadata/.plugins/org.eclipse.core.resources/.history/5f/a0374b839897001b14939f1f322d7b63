package test;

public class ExceptionClass {
	public static void badmethod() {
		throw new RuntimeException();
	}

	public static void main(String args[]) {
		try {
			badmethod();
			System.out.println("E");
		} catch (RuntimeException ex) {
			System.out.println("A");
		} catch (Exception ex) {
			System.out.println("B");
		} finally {
			System.out.println("C");
		}
		System.out.println("D");
	}
}
