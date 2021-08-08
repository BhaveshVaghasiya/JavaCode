import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentNumber {

	public static void main(String[] args) {
		String[] data = { "leet", "i", "hello", "i", "leet", "hi", "hi", "hi" };
		TopKFrequentNumber obj = new TopKFrequentNumber();
		List<String> result = obj.frequentNumber(data, 3);
		result.stream().forEach(System.out::println);
	}

	private List<String> frequentNumber(String[] data, int k) {
		List<String> resultList = new ArrayList<>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String d : data) {
			map.put(d, map.getOrDefault(d, 0) + 1);
		}
		
		PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int occurance1 = map.get(o1);
				int occurance2 = map.get(o2);
				if (occurance1 == occurance2)
					{return o2.compareTo(o1);}
				return occurance1 - occurance2;
			}
		});

		for(Map.Entry<String, Integer> mapValue: map.entrySet()) {
			queue.add(mapValue.getKey());
			if(queue.size() > k) queue.poll();
		}
		while(!queue.isEmpty()) {
			resultList.add(queue.poll());
		}
		 Collections.reverse(resultList);
		 return resultList;
	}
}
