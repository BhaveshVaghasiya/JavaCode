
public class Result {

	public static void main(String[] args) {
		int data[] = {7,1,9,2,1,9,1,3,2,1,2,1};
		System.out.println(secondSmallestElement(data));
	}

	private static int secondSmallestElement(int[] data) {
		int minValue = Integer.MAX_VALUE;
		int secondMinValue = Integer.MAX_VALUE;
		for(int i =0; i< data.length; i++) {
			if(data[i] < minValue) {
				minValue = secondMinValue;
				secondMinValue = data[i];
				
			}
		}
		return secondMinValue;	
	}

}
