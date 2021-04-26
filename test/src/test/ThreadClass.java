package test;

public class ThreadClass extends Thread {
	public void run() {
		System.out.println("This code is running in a thread");
	}

	public static void main(String[] args) {
		ThreadClass thread = new ThreadClass();
		thread.start();
		thread.start();
	}
}