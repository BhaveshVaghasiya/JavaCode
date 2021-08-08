import java.util.ArrayList;
import java.util.Arrays;

public class ReOrderLogFile {

	public static void main(String[] args) {
		String[] logs = {"id1 abcjj","id2 abcab","id3 7979","id4 abcaa","id5 234242"};
		sortLogs(logs);
		for(String log: logs) {
			System.out.println(log);
		}
	}

	private static String[] sortLogs(String[] logs) {
		// TODO Auto-generated method stub
		Arrays.sort(logs,(log1, log2) -> {
			int index1 = log1.indexOf(" ");
			String logDetails1 = log1.substring(index1 + 1);
			String key1 = log1.substring(0,index1);
			
			int index2 = log2.indexOf(" ");
			String logDetails2 = log2.substring(index2 + 1);
			String key2 = log2.substring(0,index2);
			
			boolean log1Digit = Character.isDigit(logDetails1.charAt(0));
			boolean log2Digit = Character.isDigit(logDetails2.charAt(0));
			if(!log1Digit && !log2Digit) {
				int value = logDetails1.compareTo(logDetails2);
				if(value == 0) return key1.compareTo(key2);
			}
			return log1Digit ? (log2Digit ? 0 : 1) : -1;
		});
		return logs;
	}

}
