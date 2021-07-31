import java.util.ArrayList;

public class CountPossibleDecodingsOfAGivenDigitSequence {
 public static void main(String args[]) {
	 int[] data = {1,2,0,3,4};
	 int Result =data[0] == 0? 0:1;	 
	 ArrayList<Integer> inputData = new ArrayList<Integer>();
	 for(int i =0; i< data.length-1; i++) {
		 if(data[i] == 0 && data[i+1] == 0) {
			 Result = 0;
			 break;
		 }
		 if(data[i]+ data[i+1] < 27) {
			 Result++;
		 }
	 }
	 System.out.println(Result);
 }
}

//ABCD
//LSD
//A20CD