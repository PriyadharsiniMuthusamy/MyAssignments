package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 = "stops";
		String text2 = "potss";
		
		if(text1.length() == text2.length())
		{
			char[] convText1 = text1.toCharArray();
			Arrays.sort(convText1);
			
			char[] convText2 = text2.toCharArray();
			Arrays.sort(convText2);
			
			if(Arrays.equals(convText1, convText2))
			{
				System.out.println("The given strings are Anagram");
			}
			else
				System.out.println("The given strings are not an Anagram");
				
		}
		else
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}

	}

}
