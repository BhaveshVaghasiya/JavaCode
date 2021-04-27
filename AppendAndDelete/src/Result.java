
public class Result {
	public static String appendAndDelete(String s, String t, int k) {
		int counter = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.length() > i && s.charAt(i) != t.charAt(i)) {
                counter = (t.length() - i) * 2;
                break;
            }
        }
        counter = counter + s.length() - t.length();
        return  (counter-k) > 0 ? "No" : ((k - counter)%2 == 0) ? "Yes" : (s.length() + t.length() < k) ? "Yes" : "No";
	}
	
	public static void main(String[] args) {
		System.out.println(Result.appendAndDelete("abcd","abcdert", 10));
		
	}
	
}
