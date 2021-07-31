
public class Result {
	public static int palindromeIndex(String s) {
	    int result = -1;
	    for(int i=0, j= s.length()-1; i<s.length()/2 && j > i; i++, j--) {
	    	if(s.charAt(i) != s.charAt(j)) {
	    		if(s.charAt(i+1) == s.charAt(j) && s.charAt(i+2) == s.charAt(j-1)) {
	    			result = i;
	    			break;
	    		}else {
	    			result = j;
	    			break;
	    		}
	    	}
	    }
	    return result;
	}
	public static void main(String[] args) {
		System.out.println(Result.palindromeIndex("hgygsvlfwcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcflvsgygh"));
	}

}
