import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String data = "PWWKEW";
		System.out.println(longestSubString(data));
	}

	private static int longestSubString(String data) {
		int result = Integer.MIN_VALUE;
		Set<Character> subStringSet = new HashSet<Character>();
		for(int i =0, j=0; i <data.length() && j < data.length();) {
			if(subStringSet.contains(data.charAt(i))) {
				subStringSet.remove(data.charAt(j));
				j++;
			}else {
				subStringSet.add(data.charAt(i));
				i++;
			}
			result = Math.max(result, subStringSet.size());
		}
		return result;
	}

}
