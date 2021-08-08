import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneNumber {

	public static void main(String[] args) {
		List<String> list= letterCombination("2356");
		list.stream().forEach(System.out::println);
	}

	private static List<String> letterCombination(String digit) {
		List<String> result = new ArrayList<>();
		String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		letterCombinationRecursive(result, 0, "", digit, mapping);
		return result;	
	}

	private static void letterCombinationRecursive(List<String> result, int index, String data, String digit,
			String[] mapping) {
		if(digit.length() == index) {
			result.add(data);
			return;
		}
		String mappingValue = mapping[digit.charAt(index) - '0'];
		for(char c: mappingValue.toCharArray()) {
			letterCombinationRecursive(result, index + 1, data + c, digit, mapping);
		}
		
	}

}
