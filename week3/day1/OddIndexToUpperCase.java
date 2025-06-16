package week3.day1;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String test = "changeme";
	    
	    char chArr[] = test.toCharArray();
	    
	    System.out.println(chArr.length);	    
	    for(int i=chArr.length-1; i>=0;i--)
	    {
	    	if(i%2==1)
	    	{
	    		chArr[i] = Character.toUpperCase(chArr[i]);
	    	
	    	}
	    }
	    
	    for(int i=0; i<chArr.length;i++)
	    {
	    	System.out.print(chArr[i]);
	    }
	    

	}

}
