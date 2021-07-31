import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Result {

	public static int minimumSwaps(List<Integer> popularity) {
		// Write your code here
		int swap = 0;
		for (int i = popularity.size() - 1; i >= 1; i--) {
			int t = i;
			int min = popularity.get(i);
			int minIndex = Integer.MAX_VALUE;
			while (t >= 0) {
				if (popularity.get(t) < min) {
					min = popularity.get(t);
					minIndex = t;
				}
				t--;
			}
			if (minIndex <= popularity.size()) {
				t = minIndex;
				int temp = popularity.get(t);
				popularity.set(t, popularity.get(i));
				popularity.set(i, temp);
				swap++;
			}
		}
		popularity.forEach(a -> System.out.println(a));
		return swap;
	}

	public static void main(String[] args) throws IOException {
		int array[] = { 3,1,2 };
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < array.length; i++)
			a.add(new Integer(array[i]));
		int result = Result.minimumSwaps(a);
		System.out.println("Result: " + result);
	}
}
