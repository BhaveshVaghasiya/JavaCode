package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class consecutiveString {

	public static void main(String args[]) throws IOException {
		
		File myobj=new File("output.txt");
		FileWriter writer=new FileWriter(myobj);
		File myobj1=new File("input.txt");
		FileReader fr=new FileReader(myobj1);
		BufferedReader bf=new BufferedReader(fr);
		String st;
	    if((st=bf.read())!=null)
	    {
	    	System.out.println(st);
	    }
		
		
		
		
		String b = st.replace(" ", "");
		int result = 0;
		int count = 0;
		for(int i = 0; i< b.length(); i++) {
			String dummy = String.valueOf(b.charAt(i)).toUpperCase();
			int d = String.valueOf(b.charAt(i)).toUpperCase().charAt(0);
				if(d >= 65 && d <= 90) {
					count = count + 1;
				}else {
					count = 0;
				}
				if(result < count) {
					result = count;
				}
		}
		System.out.println("result: "+ result );
		writer.write(result);
		writer.close();
	}
}
