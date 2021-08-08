import java.util.HashMap;

public class FindRecurringSequenceFraction {

	public static void main(String[] args) {
		System.out.println(findRecurring(20,3));
	}

	private static String findRecurring(int value, int div) {
		String result ="";
		int rem = value % div;
		HashMap<Integer, Integer> recurssionMap = new HashMap<Integer,Integer>();
		while(rem != 0 && !recurssionMap.containsKey(rem)) {
			recurssionMap.put(rem, result.length());
			rem = rem * 10;
		
            int res_part = rem / div;
            result += String.valueOf(res_part);
 
            rem = rem % div;
		}
		if(rem == 0) {
			return result;
		} else if(recurssionMap.containsKey(rem)){
			return result.substring(recurssionMap.get(rem));
		}
		return "";
	}

}
