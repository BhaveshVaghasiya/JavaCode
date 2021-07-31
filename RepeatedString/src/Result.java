
public class Result {

	public static long repeatedString(String s, long n) {
	    long mulnumber = n / s.length();
	    long reminder = n % s.length();
	    long occur = 0;
	    long parOccur = 0;
	    for(int i =0 ; i< s.length(); i++) {
	    	if(String.valueOf(s.charAt(i)).equals("a")) {
	    		occur++;	
	    	}
	    	if(reminder-1 == i) {
    			parOccur = occur;
    		}
	    }
	    return (mulnumber* occur)+ parOccur;
	}
	public static void main(String[] args) {
		System.out.println(Result.repeatedString("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq", 0));
	}

}
