
public class FirstMissingPositive {

	public static void main(String[] args) {
		int[] data = {1,-2,-3,5,6};
		System.out.println(missingPositive(data));
	}

	private static int missingPositive(int[] data) {
		int result = 1;
		int containOne =0;
		if(data.length == 0) {
			return 1;
		}
		for(int i=0 ; i< data.length; i++) {
			if(data[i] ==1) {
				containOne =1;
			} else if(data[i]<0) {
				data[i] = 1;
			} 
		}
		if(containOne == 0) return 1;
		for(int i=0 ; i< data.length; i++) {
			int index = data[i] - 1;
			if(index<data.length && index>=0) {
				data[index] = -1 * data[index];
			}
		}
		for(int i=0 ; i< data.length; i++) {
			if(data[i] > 0) {
				result = i+1;
				break;
			}
		}
		return result;
	}
	
}
