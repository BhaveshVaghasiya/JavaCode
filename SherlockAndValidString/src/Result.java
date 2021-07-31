import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Result {

	public static String isValid(String s) {
		int count = 0;
		Map<Character, Integer> aMap = new HashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			aMap.put(c, aMap.containsKey(c) ? aMap.get(c) + 1 : 1);
		}
		Map<Integer, Long> fMap = aMap.values().stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		if (fMap.size() < 3) {
			int x = 0;
			for (Map.Entry<Integer, Long> f : fMap.entrySet()) {
				if (f.getValue() > 1 || (x != 0 && Math.abs(x - f.getKey()) > 1)) {
					count++;
				}
				x = f.getKey();
			}
		}
		return fMap.size() > 2 || count > 1 ? "NO" : "YES";
	}

	public static void main(String[] args) {
		System.out.println(Result.isValid("aaaabbcc"));
	}

}
