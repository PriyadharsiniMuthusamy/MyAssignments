package week3.day2Assignments;

public class APIClient2 {
	
	public void sendRequest(String endPoint)
	{
		System.out.println(endPoint);
	}
	
	public void sendRequest(String endPoint, String requestBody, Boolean requestStatus)
	{
		System.out.println(requestStatus);
		System.out.println(requestBody);
		System.out.println(endPoint);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		APIClient2 cl = new APIClient2();
		cl.sendRequest("Hello", "Good Day", true);
		cl.sendRequest("Hey");
		

	}

}
