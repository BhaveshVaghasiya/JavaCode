import java.util.ArrayList;
import java.util.List;

public class MakingLargeIsland {

	public static void main(String[] args) {
		int[][] data = {{ 0, 1, 0, 1, 0},
						{ 1, 0, 0, 0, 1},
						{ 0, 0, 1, 1, 0}};
		System.out.println(makingIsland(data));
		
	}

	private static int makingIsland(int[][] data) {
		int islandLength = 0;
		for(int i =0 ; i< data.length; i++) {
			for(int j =0; j< data[i].length ; j++) {
				if(data[i][j] == 0) {
					data[i][j] = 1;
				List<String> point = new ArrayList<>();
					travarse(data, i, j, point);
				for(String p: point) {
					String[] strArray = p.split(",");
					int x = Integer.valueOf(strArray[0]);
					int y = Integer.valueOf(strArray[1]);
					data[x][y] = 1;
				}
					islandLength = Math.max(islandLength ,point.size());
					data[i][j] = 0;
				}
				
			}
		}
		return islandLength;
	}

	private static void travarse(int[][] data, int i, int j, List<String> point) {
		if(i < 0 || j< 0 || i>= data.length || j >= data[i].length || data[i][j] ==0) {
			return;
		}
		data[i][j] = 0;
		travarse(data, i+1 , j, point);
		travarse(data, i-1 , j, point);
		travarse(data, i , j+1, point);
		travarse(data, i , j-1, point);
		String p = i + "," + j;
		point.add(p);
	}

}
