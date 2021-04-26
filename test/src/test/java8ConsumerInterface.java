package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class java8ConsumerInterface {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alex", "Brian", "Charles");

		Consumer<String> makeUpperCase = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t.toUpperCase());
			}
		};

		names.forEach(makeUpperCase);
		
		Consumer<List<String>> firstC = list -> list.stream().forEach(a -> System.out.print(a.toUpperCase() + " "));
	    Consumer<List<String>> secondC = list -> list.stream().forEach(a -> System.out.print(a.toLowerCase() + " "));
	    Consumer<List<String>> result = firstC.andThen(secondC);
	 
	    result.accept(names);// if only call secondC than secondC.accept(names);
	}
}
