package week3.day1;

public class FindArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]={3,2,11,4,6,7};
		 int b[]={1,8,2,4,7,9};
		 

		 System.out.println("Intersected values: ");
		 for(int i=0;i<a.length;i++)
		 {
			 for (int j=0; j<b.length;j++)
			 {
				 if(a[i]==b[j])
				 {
					 System.out.println(b[j]);
					 break;
				 }
			 }
		 }

	}
}
