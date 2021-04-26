package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class urmil {

	public static void main(String args[]) {
		Scanner myInput = new Scanner( System.in );
		List<Integer> arr =  new ArrayList<Integer>();
	    for(int i=0; i< 10000; i++) {
	    	int data = myInput.nextInt();
	    	if(data < 0) {
		    	break;}
	    	arr.add(data);
	
	    } 
	    System.out.println(arr.size());
	}
}
