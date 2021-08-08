import java.util.HashSet;
import java.util.Set;

/*Given a boolean 2D matrix. The task is to find the number of distinct islands where a group of connected 1s (horizontally or vertically) forms an
 island. Two islands are considered to be distinct if and only if one island is equal to another (not rotated or reflected).

Examples:

Input: grid[][] =
{{1, 1, 0, 0, 0},
1, 1, 0, 0, 0},
0, 0, 0, 1, 1},
0, 0, 0, 1, 1}}

Output: 1*/
public class NumberOfDistinctIsland {

	public static void main(String[] args) {
		int[][] data = {{1, 1, 0, 1, 1},
						{1, 1, 0, 0, 0},
						{0, 0, 0, 1, 1},
						{1, 1, 0, 1, 1}};
		System.out.println(numOfDistinctIsland(data));		
	}

	private static int numOfDistinctIsland(int[][] data) {
		int count = 0; 
		Set<String> uniqIsland = new HashSet<String>();
		for(int i = 0; i< data.length; i++) {
			for(int j = 0; j< data[i].length; j++) {
				if(data[i][j] == 1) {
					String path = exploreIsland(data, i, j, "X");
					uniqIsland.add(path);
				}
			}
		}
		return uniqIsland.size();
	}

	private static String exploreIsland(int[][] data, int i, int j, String direction) {
		if(i < 0 || j < 0 || i>= data.length || j >=data[i].length || data[i][j] == 0) {
			return "O";
		} 
		data[i][j] = 0;
		String right = exploreIsland(data, i+1, j, "R");
		String left = exploreIsland(data, i-1, j, "L");
		String top = exploreIsland(data, i, j+1, "T");
		String bottom = exploreIsland(data, i, j-1, "B");
		return direction + right + left + top + bottom;
	}

}
