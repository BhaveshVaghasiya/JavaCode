
public class StringRemoveConsecutiveChar {

	public static void main(String[] args) {
		String data = "geeeksforgeeks";
		System.out.println(removeConsecutive(data));
	};

	private static StringBuilder removeConsecutive(String data) {
		StringBuilder result = new StringBuilder("");
		for (int i = 0; i < data.length();) {
			if (i < data.length() - 1 && data.charAt(i) == data.charAt(i + 1)) {
				char temp = data.charAt(i);
				while (i < data.length() && data.charAt(i) == temp) {
					i++;
				}
			} else {
				result = result.append(data.charAt(i));
				i++;
			}
		}
		return result;
	}
}
