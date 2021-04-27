import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
	public static String angryProfessor(int k, List<Integer> a) {
		// Write your code here
		int counter = 0;
		for (int v : a) {
			if (v < 1) {
				counter++;
			}
		}
		System.out.println("Result: thresold: " + a.size() + "attendance: " + counter);
		return k > counter ? "YES" : "NO";
	}

}