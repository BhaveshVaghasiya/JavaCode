package Level1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MinimumDistance {
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
		int array[] = { 7, 1, 3, 4, 1, 7, 0 };
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < array.length; i++)
			a.add(new Integer(array[i]));
		int result = MinimumDistance.minimumDistances(a);
		System.out.println("Result: " + result);
	}
}
