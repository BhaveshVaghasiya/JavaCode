package test;

import java.util.HashMap;

class ThredFinalVariable {
	final int num = 040;
	void display() {
		 int num = 010;
		{
			Runnable r = new Runnable() {
				final int num = 020;

				@Override
				public void run() {
					int num = 010;
					System.out.println(num);
				}

			};
			r.run();
		}
	}

	public static void main(String args[]) {
		ThredFinalVariable nj = new ThredFinalVariable();
		nj.display();
	}

}