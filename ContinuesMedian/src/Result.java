import java.util.Collections;
import java.util.PriorityQueue;

public class Result {

	public static PriorityQueue<Integer> maxQ = new PriorityQueue<Integer>(Collections.reverseOrder());
	public static PriorityQueue<Integer> minQ = new PriorityQueue<Integer>();
	
	public static void medianTracker(int [] array) {
        for (int i = 0; i < array.length; i++) {
            addNumber(array[i]);
            System.out.println(getMedian());
        }
    }
	
	private static Double getMedian() {
		if(maxQ.size() == 0) {
			return 0;
		} else if(minQ.size() == maxQ.size()) {
			return (float) ((minQ.peek() + maxQ.peek())/2.0);
		} else {
			return maxQ.peek();
		}
	}

	private static void addNumber(int i) {
		if(maxQ.isEmpty()) {
			maxQ.add(i);
		} else{
			if(i > maxQ.peek()) {
				minQ.add(i);
			}else {
				maxQ.add(i);
			}
		}
		if(maxQ.size() > minQ.size() + 1) {
			minQ.add(maxQ.peek());
			maxQ.remove();
		}else if(minQ.size() > maxQ.size()) {
			maxQ.add(minQ.peek());
			minQ.remove();
		}
	}

	public static void main(String[] args) {
		int array[] = {6,3,2,4,1,5};
		medianTracker(array);
    }

}
