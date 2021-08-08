
public class ReverseInteger {

	public static void main(String[] args) {
		int data= -1230;
		ReverseInteger ri = new ReverseInteger();
		System.out.println(ri.reverse(data));
	}

	private long reverse(int i) {
		long result = 0;
		while (i != 0) {
			int j = i % 10;
			result = result * 10 + j;
			i = i / 10;
		}
		return result;
	}

}
