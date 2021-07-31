
public class Result {
	
	public static void main(String[] args) throws java.lang.Exception
    {
        int M[][] = new int[][] { { 1, 1, 0, 0, 0 },
                                  { 1, 1, 0, 0, 1 },
                                  { 1, 0, 0, 1, 1 },
                                  { 1, 0, 0, 0, 1 },
                                  { 1, 0, 1, 1, 1 } };
        
        System.out.println("Number of islands is: " + countIslands(M));
    }

	public static int countIslands(int[][] m) {
		int count = 0;
		for(int i =0; i< m.length; i++) {
			for(int j =0; j< m[i].length; j++) {
				if(m[i][j] == 1) {
					trackIslandArea(m, i, j);
					count++;
				}
			}
		}
		return count;
	}

	private static void trackIslandArea(int[][] m, int i, int j) {
		if(i >= 0 && i < m.length && j >= 0 && j < m[i].length && m[i][j] != 0) {
			m[i][j] = 0;
			trackIslandArea(m, i+1, j);
			trackIslandArea(m, i-1, j);
			trackIslandArea(m, i, j+1);
			trackIslandArea(m, i, j-1);
		}
		
	}
}
