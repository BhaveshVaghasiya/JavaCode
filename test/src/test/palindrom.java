package test;

import java.util.HashMap;

public class palindrom {
	 private int age;

	public palindrom(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String args[]) {
		HashMap<palindrom,Integer> hm =  new HashMap<palindrom,Integer>();
		hm.put(new palindrom(1),1);
		hm.put(new palindrom(1),1);
		
		System.out.println(hm.size());
	}
}
