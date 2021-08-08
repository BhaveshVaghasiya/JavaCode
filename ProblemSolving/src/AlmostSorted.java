import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlmostSorted {

	public static void almostSorted(List<Integer> arr) {
		List<Integer> farr = new ArrayList<Integer>();
		for (int i = 0; i < arr.size() - 1; i++) {
			if (arr.get(i) > arr.get(i + 1)) {
				farr.add(i + 1);
			}
		}
		if (farr.size() == 1) {
			if ((farr.get(0) + 1 < arr.size() && arr.get(farr.get(0) - 1) > arr.get(farr.get(0) + 1)) || 
					(farr.get(0) -1 > 0 && arr.get(farr.get(0)) < arr.get(farr.get(0) - 2))) {
				System.out.println("no");
			} else {
				int end = farr.get(0) + 1;
				System.out.println("yes \n" + "swap " + farr.get(0) + " " + end);
			}
		} else {
			if (farr.size() == 2) {
				if(farr.get(0) - farr.get(1) == 1) {
					System.out.println("yes \n" +"swap " + farr.get(0) + " " + farr.get(1));
				}else {
					int end = farr.get(1) +1;
					System.out.println("yes \n" +"swap " + farr.get(0) + " " + end);
				}
				
			} else {
				boolean re = true;
				for (int j = 0; j < farr.size() - 1; j++) {
					if (farr.get(j) != farr.get(j + 1) - 1) {
						System.out.println("no");
						re= false;
						break;
					}
				}
				if(re) {
					int end = farr.get(farr.size()-1) +1;
				    System.out.println("yes \n" +"reverse "+ farr.get(0) + " " + end);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\asus\\Downloads\\data.txt"));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(Collectors.toList());

		AlmostSorted.almostSorted(arr);
	}
}
