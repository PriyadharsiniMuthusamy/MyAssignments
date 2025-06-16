package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int seq[]={1,4,3,2,8,6,7}; //1 2 3 4 6 7 8 
		                         //  0 1 2 3 4 5 6
		Arrays.sort(seq);
		System.out.println("Missing numbers:");
		for(int i=0; i<seq.length;i++)
		{
			
			if(seq[i]!=i+1)
			{
				System.out.println(i+1);
			    break;
			}
		}

	}

}
