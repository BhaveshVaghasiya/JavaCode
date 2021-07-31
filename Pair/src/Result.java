import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Result {
	public static int pairs(int k, List<Integer> arr) {
		int counter = 0;
		Collections.sort(arr);
		for(int i = 0; i < arr.size() - 1; i++) {
			for(int j = i+1; j< arr.size(); j++) {
				if(arr.get(j) - arr.get(i) == k) {
					counter++;
				}else if(arr.get(j) - arr.get(i) > k) {
					break;
				}
			}
		}
		return counter;
	}
	
	public static void main(String[] args) throws IOException {
		Integer[] a = { 1, 5, 3, 4, 2};
		float bh = Float.parseFloat("3.1415876E");
		List<Integer> arr = Arrays.asList(a);
		System.out.println(bh);
  }
}
