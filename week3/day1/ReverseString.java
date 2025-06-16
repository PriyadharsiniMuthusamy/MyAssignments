package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "TestLeaf";
		char chArr[]= text.toCharArray();
		for(int i=chArr.length-1; i>0; i--)
		{
			System.out.print(chArr[i]);
		}

	}

}
