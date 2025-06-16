package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		String text = "I am a software tester";
		String stArr[] = text.split(" ");
		for(int i=0;i<stArr.length;i++)
		{
			if(i%2==1)
			{
				char chArr[] = stArr[i].toCharArray();
				for(int j=chArr.length -1;j>=0;j--)
				{
					System.out.print(chArr[j]);
				}
				System.out.print(" ");
			}
			else 
			{
				System.out.print(stArr[i]+" ");
			}
		}

	}

}
