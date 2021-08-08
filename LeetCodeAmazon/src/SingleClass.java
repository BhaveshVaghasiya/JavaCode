
public class SingleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 2, 4, 7, 1, 5, 1, 2, 7, 4 };
		System.out.println(findSingleNumber(data));
	}

	private static int findSingleNumber(int[] data) {
		int result = 0;
		for(int i:data) {
			result ^= i;
		}
		return result;
	}
}
