import java.util.ArrayList;
import java.util.List;

public class MinStack {
	
	List<Integer> arr = new ArrayList<Integer>();
	List<Integer> minArr = new ArrayList<Integer>();
	int count = 0;
	public int pop() {
		int popValue = arr.get(count-1);
		arr.remove(count-1);
		count--;
		return popValue;
	}

	public void push(int data) {
		arr.add(data);
		
		if(minArr.size() > 0 && minArr.get(count-1) < data) {
			minArr.add(minArr.get(count-1));
		}else {
			minArr.add(data);
		}
		count++;
	}
	
	public int top() {
		return arr.get(count-1);
	}
	
	public int getMin() {
		return minArr.get(count-1);
	}

	public static void main(String[] args) {
		MinStack minStack =new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.top());
		System.out.println(minStack.getMin());
	}

}
