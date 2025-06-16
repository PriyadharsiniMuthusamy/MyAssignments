package week3.day1;

import java.util.Arrays;

public class TestArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark[]= {5,2,5,7,7,9,2,3};
		int len = mark.length;
		System.out.println("Length of array:"+ len);
		Arrays.sort(mark);
		System.out.println("Duplicates:");
		
		for(int i=0; i<len-1; i++)
		{
				if(mark[i] == mark[i+1])  
				{
					System.out.println(mark[i]);
				}
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		}

	}

}
