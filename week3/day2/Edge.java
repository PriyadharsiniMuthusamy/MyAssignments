package week3.day2;

public class Edge extends Browser {
	
	public void takeSnap()
	{
		System.out.println("ScreenShot captured");
	}
	public void clearCookies()
	{
		System.out.println("Cookies Cleared");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
			Edge ed = new Edge();
			System.out.println("Edge Browser");
			ed.openURL();
			ed.takeSnap();
			ed.navigateBack();
			ed.clearCookies();
			ed.closeBrowser();
		

	}

}
