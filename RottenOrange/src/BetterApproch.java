import java.util.HashSet;
import java.util.Set;

public class BetterApproch {
	public static void main(String args[]) {
		int[][] orange= {{2,1,1,0,0,0},
				{2,1,1,0,0,0},
				{2,1,1,0,2,1},
				{2,1,1,0,0,1},
				{2,1,1,0,0,0},
				{2,1,1,0,0,1},
				{2,1,1,0,0,0}};
		
		System.out.println("Time required to rotten all the oranges" + rottenOrange(orange));
	}

	private static int rottenOrange(int[][] v) {
		int time=0;
		Set<String> fresh= new HashSet<String>();
		Set<String> rotten= new HashSet<String>();
		for(int i =0 ; i< v.length; i++) {
			for(int j=0; j< v[i].length; j++) {
				if(v[i][j] == 1) {
					fresh.add("" + i + j);
				} else if(v[i][j] == 2) {
					rotten.add("" + i + j);
				}
			}
		}
		while(fresh.size() > 0) {
			Set<String> newRotten= new HashSet<String>();
			int[][] direction = {{0,1},{1,0},{-1,0},{0,-1}};
			for(String rottenPosition: rotten) {
				int i = rottenPosition.charAt(0) - '0';
				int j = rottenPosition.charAt(1) - '0';
				for(int[] d:direction) {
					int l = d[0] + i;
					int m = d[1] + j;
					if(fresh.contains(""+ l+ m)) {
						fresh.remove(""+ l+ m);
						newRotten.add(""+ l+ m);
					}
				}
			}
			if(newRotten.size() == 0) {
				return -1;
			}
			rotten= newRotten;
			time++;
		}
		return time;
	}

	private static String charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
