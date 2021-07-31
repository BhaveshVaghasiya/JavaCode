import java.util.ArrayList;
import java.util.List;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trappingRainWater(data));
	}

	private static int trappingRainWater(int[] buldingHeight) {
		int totalBuilding = buldingHeight.length;
		int result = 0;
		List<Integer> lmax = new ArrayList<Integer>();
		List<Integer> rmax = new ArrayList<Integer>();
		int iCounter = 0;
		int jCounter = 0;
		for(int i =0, j=totalBuilding-1 ; i< totalBuilding && j >= 0; i++, j--) {
			if(iCounter <= buldingHeight[i])
				iCounter = buldingHeight[i];
			lmax.add(iCounter);
			if(jCounter <= buldingHeight[j])
				jCounter = buldingHeight[j];
			rmax.add(jCounter);
		}
		for(int i =0 ; i< totalBuilding ; i++) {
			result = result + (Math.min(lmax.get(i), rmax.get(totalBuilding-i-1)) - buldingHeight[i]);
		}
		return result;
		
	}

}
