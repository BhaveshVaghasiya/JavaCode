import java.util.PriorityQueue;

public class MergeTwoArrayUsingPriorityQueue {

	public static void main(String[] args) {
		int[] arr1 = {3,6,9,10};
		int[] arr2 = {1,2,6,7,8,13,16,19,110};
		PriorityQueue<Integer> pQueue= new PriorityQueue<Integer>(20);
		
		for(int a1:arr1) {
			pQueue.add(a1);
		}
		for(int a2:arr2) {
			pQueue.add(a2);
		}
		while(pQueue.size() > 0) {
			System.out.println(pQueue.remove());
		}
	}

}
