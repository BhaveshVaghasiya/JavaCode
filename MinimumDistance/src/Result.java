import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Result {
	public static int minimumDistances(List<Integer> a) {
		int result = a.size();
		for (int i = 0; i < a.size(); i++) {
			int count = 0;
			for (int j = i + 1; j < a.size(); j++) {
				count++;
				if (a.get(i).equals(a.get(j)) && result > count) {
					result = count;
					break;
				}
			}
		}
		if (result == a.size()) {
			return -1;
		} else {
			return result;
		}
	}

	public static void main(String[] args) throws IOException {
		int array[] = { 7, 1, 3, 1, 7, 9, 9};
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < array.length; i++)
			a.add(new Integer(array[i]));
		int result = Result.minimumDistances(a);
		System.out.println("Result: " + result);
	}
}
