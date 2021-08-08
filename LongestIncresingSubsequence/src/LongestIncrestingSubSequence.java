
public class LongestIncrestingSubSequence {

	public static void main(String[] args) {
		int[] data = {10,22,9,33,21,50,41,60,80};
		System.out.println(longestSubSequence(data));
	}

	private static int longestSubSequence(int[] data) {
		int result = Integer.MIN_VALUE; 
		if(data.length == 1)
			return 1;
		int[] maxSeqArr = new int[data.length]; 
		maxSeqArr[0] =1;
		for(int i = 1; i< maxSeqArr.length ; i++) {
			int max = 0;
			for(int j = i-1; j >= 0; j--) {
				if(data[j] < data[i]) {
					if(maxSeqArr[j] > max) {
						max = maxSeqArr[j] + 1;
					}
				}
			}
			maxSeqArr[i] = max == 0? 1: max;
			if(result < max) {
				result = max;
			}
		}
		return result;
	}

}
