package week1.day2;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 122341 ;
		int number = input;
		int reminder,output=0;
		
		while(number>0)
		{
			reminder = number%10;
			output = output * 10 + reminder;
			number=number/10;
			
	
		}
		if(input == output)
		{
			System.out.println("Number is a palindrome");
		}
		else
		{
			System.out.println("Number is not a palindrome");
		}
		
	   

	}

}
