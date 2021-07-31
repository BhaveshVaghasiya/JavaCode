import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Result {
	public static int nonDivisibleSubset(int k, List<Integer> s) {
		
		Map<Integer, Long> aMap = s.stream().map(e -> e%k)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Set<Integer> rej = new HashSet<Integer>();
		List<Integer> dlist = aMap.keySet().stream().collect(Collectors.toList());
		long count = 0;
		for(int i = 0; i< dlist.size()-1; i++) {
			for(int j = i+1; j < dlist.size(); j++) {
				int ivar = dlist.get(i);
				int jvar = dlist.get(j);
				Long ifre = aMap.get(ivar);
                if((ivar+jvar) % k == 0) {
                	Long jfre = aMap.get(jvar);
                    if(!rej.contains(ivar) && !rej.contains(jvar) && ifre < jfre) {
                    	rej.add(ivar);
                    	count = count + ifre;
                    }else if(!rej.contains(ivar) && !rej.contains(jvar)) {
                    	rej.add(jvar);
                    	count = count + jfre;
                    }
                }
            }
		}
		if( k!= 1 && k%2 ==0 && !rej.contains(k/2) && dlist.contains(k/2)) {
			count= count++;
		}
		if(dlist.contains(0) && aMap.get(0) > 1.0) {
			count = count + aMap.get(0) - 1;
		}
		return (int) (s.size() -count);
	}
	public static void main(String[] args) {
		Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		List<Integer> arr = Arrays.asList(a);
		System.out.println(Result.nonDivisibleSubset(4, arr));
	}
}
