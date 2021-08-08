import java.util.PriorityQueue;

public class ConnectRopes {

	public static void main(String[] args) {
		int[] ropeData = {4,3,2,6};
		System.out.print(minCost(ropeData));
	}

	private static int minCost(int[] ropeData) {
		int result = 0;
		if(ropeData.length == 0)
			return 0;
		else if(ropeData.length == 1)
			return ropeData[0];
		else if(ropeData.length == 2)
			return ropeData[0] + ropeData[1];
		else {
			PriorityQueue<Integer> ropeQ = new PriorityQueue<Integer>();
			for(int r: ropeData) {ropeQ.add(r);}//add data in PriorityQ
			while(ropeQ.size() > 1) {
				int i = ropeQ.poll();
				int j = ropeQ.poll();
				result += i+j;
				ropeQ.add(i+j);
			}
		}
		return result;
	}

}
