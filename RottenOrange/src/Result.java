import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Result {
	public static void main(String[] args)
	{
	    int v[][] = { { 2, 1, 0, 2, 1 },
	                  { 1, 0, 1, 2, 1 },
	                  { 1, 0, 0, 2, 1 } };
	  
	    System.out.println("Max time incurred: " +
	                       rotOranges(v));
	}
	static Queue<String> queueList = new LinkedList<String>(); 
	private static int rotOranges(int[][] v) {
		int result = 0;
		int freshOrange= 0;
		for(int i=0; i< v.length; i++) {
			for(int j=0; j< v[i].length; j++) {
				if(v[i][j] == 2) {
					queueList.add("" + i + j + "0");
				}else if(v[i][j] == 1) {
					freshOrange++;
				}
				
			}
		}
		
		while(queueList.size() > 0) {
			String temp = queueList.remove();
			int freshMangoRotten = rottenOrangeCheck(v, temp);
			freshOrange = freshOrange-freshMangoRotten;
			result = Character.getNumericValue(temp.charAt(2));
		}
		return freshOrange > 0 ? -1 : result;
	}

	private static int rottenOrangeCheck(int[][] v, String temp) {
		int freshMangoRotten = 0;
		int i = Character.getNumericValue(temp.charAt(0));
		int j = Character.getNumericValue(temp.charAt(1));
		int lapse = Character.getNumericValue(temp.charAt(2));
		lapse++; 
		int[][] direction = {{0,1},{0,-1},{1,0},{-1,0}};
		for(int k = 0;k < 4; k++ ) {
			int l = direction[k][0] + i;
			int m = direction[k][1] + j;
			if(l>=0 && m >=0 && l < v.length && m < v[i].length && v[l][m] == 1) {
				v[l][m] = 2;
				queueList.add(""+ l + m + lapse);
				freshMangoRotten++;
			}
		}
		return freshMangoRotten;
	}
}
