package week3.day2;

public class Chrome extends Browser{
	
	public void openIncognito()
	{
		System.out.println("Incognito opened");
	}
	public void clearCache()
	{
		System.out.println("Cached Cleared");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chrome ch = new Chrome();
		System.out.println("Chrome Browser");
		ch.openURL();
		ch.openIncognito();
		ch.navigateBack();
		ch.clearCache();
		ch.closeBrowser();

	}

}
