package week3.day2;

public class Safari extends Browser{
	public void readerMode()
	{
		System.out.println("Reader Mode Applied");
	}
	public void fullScreenMode()
	{
		System.out.println("Full Screen Mode Activated");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Safari sf = new Safari();
		System.out.println("Safari Browser");
		sf.openURL();
		sf.fullScreenMode();
		sf.readerMode();
		sf.navigateBack();
		sf.closeBrowser();

	}

}
