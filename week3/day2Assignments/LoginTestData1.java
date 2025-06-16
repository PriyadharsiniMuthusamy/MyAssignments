package week3.day2Assignments;

public class LoginTestData1 extends TestData1 {
	public void enterUsername()
	{
		System.out.println("Username Entered");
	}
	public void enterPassword()
	{
		System.out.println("Password Entered");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginTestData1 log = new LoginTestData1();
		log.enterCredentials();
		log.navigateToHomePage();
		log.enterUsername();
		log.enterPassword();
		
	}

}
