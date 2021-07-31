import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Result {
	public static String morganAndString(String a, String b) {
		StringBuilder result = new StringBuilder();
		for(int i =0, j = 0; i<a.length() && j <b.length();) {
			if((int)a.charAt(i) < (int)b.charAt(j) || ((int)a.charAt(i) == (int)b.charAt(j) && (int)a.charAt(i+1) < (int)b.charAt(j+1))) {
				result.append(a.charAt(i));
				i++;
				if(i == a.length()) {
					result.append(b.substring(j));
					break;
				}
			}else {
				result.append(b.charAt(j));
				j++;
				if(j == b.length()) {
					result.append(a.substring(i));
					break;
				}
			}
		}
		return result.toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\asus\\Downloads\\data.txt"));
       
        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String a = bufferedReader.readLine();

                String b = bufferedReader.readLine();

                String result = Result.morganAndString(a, b);

                System.out.println(result);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
  }
}
