import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

class ListMap{
	private Map<Integer, Integer> map;
	private List<Integer> list;
	private Random random;
	
	public ListMap(){}
	
	public boolean insert(int val) {
		if(map.containsKey(val)) return false;
		map.put(val, list.size());
		list.add(val);
		return true;
	}
	
	public boolean remove(int val) {
		if(!map.containsKey(val)) return false;
		int index = map.get(val);
		int lastValue = list.get(list.size() -1);
		list.set(index, lastValue);
		list.remove(list.size()-1);
		map.put(lastValue, index);
		map.remove(val);
		return true;
	}
	
	public int getRandom(int val) {
		int index = random.nextInt(list.size());
		return list.get(index);
	}
}
public class InsertDeleteGetRandomO1 {
	
	
	public static void main(String[] args) {
		
	}

}
