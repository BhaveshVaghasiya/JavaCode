
public class Result {
	public static void main(String args[]) {
		System.out.println(Result.countingValley(12, "DDUUDDUDUUUD"));

	}

	private static int countingValley(int steps, String path) {
		int result = 0;
		int count = 0;
		for (int i = 0; i < steps; i++) {
			count = Character.toString(path.charAt(i)).contentEquals("U") ? count + 1 : count - 1;
			result = Character.toString(path.charAt(i)).contentEquals("U") && count == 0 ? result + 1 : result;
		}
		return result;
	}
}
