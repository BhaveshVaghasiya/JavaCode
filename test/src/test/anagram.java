package test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class anagram  {
	public static void main(String args[])throws IOException
	{
	File myobj=new File("C:\\Users\\asus\\Downloads\\abc1.txt");
	
	FileWriter writer=new FileWriter(myobj);
	writer.write("javaprogram");
	writer.close();
	//System.out.println("hello");
	FileReader fr=new FileReader(myobj);
	BufferedReader bf=new BufferedReader(fr);
	String st;
    if((st=bf.readLine())!=null)
    {
    	System.out.println(st);
    }
    String str="rogramjava";
    char s1[]=st.toCharArray();
    char s2[]=str.toCharArray();
    
    Arrays.sort(s1);
    Arrays.sort(s2);
	
	if(st.length()==str.length())
	{
	 boolean status=Arrays.equals(s1, s2);
	  if(status)
	  {
		  System.out.println("String is anagram");
	  }
	  else
	  {
		  System.out.println("String is not anag1ram");
	  }
	}
	else
	{
		System.out.println("String is not anagram");
	}
	
	}
	}

