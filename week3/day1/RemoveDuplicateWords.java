package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions in java week1";
		String stArr[] = text.split(" ");
		for(int i=0; i<stArr.length ;i++)
		{
			for(int j=i+1; j<stArr.length;j++)
			{
				
				if(stArr[i].equals(stArr[j]))
				{
					//System.out.print(stArr[i]+ " ");
					//System.out.print(stArr[j]+ " ");
					stArr[i] = stArr[i].replace(stArr[i]," ");
					stArr[j] = stArr[j].replace(stArr[j]," ");
					//System.out.println(stArr[j]);
					
				}
			}
			System.out.print(stArr[i]+" ");
		}

	}

}
