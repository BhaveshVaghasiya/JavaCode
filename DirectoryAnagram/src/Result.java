import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

	public static void main(String[] args) {
		String wordArr[] = { "cat", "dog", "tac", "god", "act" };
        int size = wordArr.length;
        printAnagramsTogether(wordArr, size);
	}

	public static void printAnagramsTogether(String[] wordArr, int size) {
		Map<String, List<String>> result = new HashMap<>();
		for(String data: wordArr) {
			char tempArr[] = data.toCharArray();
			Arrays.sort(tempArr);
			String key = String.valueOf(tempArr);
			List<String> tempList = new ArrayList<String>();
			if(result.containsKey(key)) {
				tempList = result.get(key);
				tempList.add(data);
				result.put(key, tempList);
			} else {
				tempList.add(data);
				result.put(key, tempList);
			}	
		}
		int i = 1;
		for(List<String> data:result.values()) {
			System.out.println("Anagram List:" + i);
			data.stream().forEach(System.out::println);
			i++;
		}
	}

}
