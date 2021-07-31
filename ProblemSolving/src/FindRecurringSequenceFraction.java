import java.util.HashMap;

public class FindRecurringSequenceFraction {

	public static void main(String[] args) {
		System.out.println(findRecurring(20,3));
	}

	private static String findRecurring(int value, int div) {
		String result ="";
		int rem = value / div;
		HashMap<String, Integer> recurssionMap = new HashMap<String,Integer>();
		System.out.println("rem value" + rem);
		if(rem == 0) {
			return result;
		} else{
			return result;
		}
		
	}

}
