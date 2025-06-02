package week1.day2;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		
		for(int boundary = 2 ; boundary <=100; boundary++)
		{
			for(int i=2; i<=boundary; i++)
			{
			   if(i==boundary)
			   {
				   System.out.println(boundary);
			   }
			   if(boundary%i == 0)
			   {
				   break;
			   }
			}
		}
	}
}
