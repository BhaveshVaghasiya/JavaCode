
public class SmallestSubArray {

	public static void main(String[] args) {
		int[] data = {4,6,3,1,6,9,4,3,15};
		System.out.println(resultMethod(data,12));
	}

	private static int resultMethod(int[] data, int value) {
		int result = Integer.MAX_VALUE;
		int sum =0;
		int iIndex = 0;
		for(int i=0, j= 0; i< data.length && j < data.length;) {
			sum += data[j];
			if(sum <= value) {
				j++;
			} else {
				if(result > j-i+1) {
					result = j-i+1;		
					iIndex= i;
				}
				sum = sum - data[i] -data[j];
				i++;
			}
		}
		return result;
	}

}
