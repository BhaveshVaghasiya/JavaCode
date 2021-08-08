
public class MinimumStationRequireForMetro {

	public static void main(String[] args) {
		int[] arrival = {900, 940, 950, 1100, 1500, 1800};
		int[] departure = {910, 1200, 1120, 1130, 1900, 2000};
		System.out.println(minStation(arrival, departure));
	}

	private static int minStation(int[] arrival, int[] departure) {
		int result = Integer.MIN_VALUE;
		for(int i = 0; i< arrival.length; i++) {
			int j = i-1;
			int count = 0;
			while(j >= 0) {
				if(arrival[i] < departure[j]) {
					count++;
				}
				j--;
			}
			if(result < count)
				result =count;
		}
		return result+1;
	}

}
