package test;

import java.util.ArrayList;
import java.util.List;

public class consecutiveNum {

	public static int consecutiveSum(int k, List<Integer> valueList){
		int sum = 0;
		for(int i= 0; i<= valueList.size() - k; i++) {
			int tempSum = 0;
			for(int j=0; j < k; j++ ) {
				 tempSum = tempSum + valueList.get(i + j);
			}
			if(tempSum > sum){
				sum= tempSum;
			}
		}
		return sum;
	}
	
	public static void main(String args[]) {
		List<Integer> inputList = new ArrayList<Integer>();
		inputList.add(1);
		inputList.add(2);
		inputList.add(54);
		inputList.add(3);
		inputList.add(7);
		inputList.add(-60);
		inputList.add(34);
		inputList.add(26);
		System.out.println(consecutiveSum(3, inputList));
	}
}
