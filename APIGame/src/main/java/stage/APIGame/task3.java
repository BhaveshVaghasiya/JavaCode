package stage.APIGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.StringTokenizer;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

public class task3 {
	public static void POSTRequest(int count) throws IOException {
	    final String POST_PARAMS = "{\"wordCount\":"+ count+"}";
	    System.out.println(POST_PARAMS);
	    HttpPost postRequest = new HttpPost("https://http-hunt.thoughtworks-labs.net/challenge/output");
	    StringEntity input = new StringEntity(POST_PARAMS);
	    input.setContentType("application/json");
        postRequest.setEntity(input);
       postRequest.setHeader("userId", "e_NkqYoch");
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpResponse response = httpClient.execute(postRequest);
	        
	 
	        BufferedReader br = new BufferedReader(
	                new InputStreamReader((response.getEntity().getContent())));
	 
	        String output;
	        StringBuffer totalOutput = new StringBuffer();
	        System.out.println("Output from Server .... \n");
	        while ((output = br.readLine()) != null) {
	            System.out.println(output);
	            totalOutput.append(output);
	        }
	        System.out.println(totalOutput.toString());
	}
	public static void GETRequest() throws IOException {
	    URL urlForGetRequest = new URL("https://http-hunt.thoughtworks-labs.net/challenge/input");
	    String readLine = null;
	    HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
	    conection.setRequestMethod("GET");
	    conection.setRequestProperty("userId", "e_NkqYoch"); // set userId its a sample here
	    int responseCode = conection.getResponseCode();
	    if (responseCode == HttpURLConnection.HTTP_OK) {
	        BufferedReader in = new BufferedReader(
	            new InputStreamReader(conection.getInputStream()));
	        StringBuffer response = new StringBuffer();
	        while ((readLine = in .readLine()) != null) {
	            response.append(readLine);
	        } in .close();
	        // print result
	        System.out.println(response.toString());
	        JSONObject obj = new JSONObject(response.toString());      
	        String input = obj.getString("text");
	        StringTokenizer tokens = new StringTokenizer(input);
	       
	        POSTRequest(tokens.countTokens());
	        //GetAndPost.POSTRequest(response.toString());
	    } else {
	        System.out.println("GET NOT WORKED");
	    }
	}
}
