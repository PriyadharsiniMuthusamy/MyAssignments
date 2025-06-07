package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTapAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String uname ="DemoSalesManager";
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester:Priya3");
		driver.findElement(By.id("groupNameLocal")).sendKeys("Demo");
		
		WebElement el = driver.findElement(By.name("industryEnumId"));
		Select drpdwn = new Select(el);
		drpdwn.selectByIndex(3);
		
		el = driver.findElement(By.name("ownershipEnumId"));
		drpdwn = new Select(el);
		drpdwn.selectByIndex(4);
		
		el = driver.findElement(By.id("dataSourceId"));
		drpdwn = new Select(el);
		drpdwn.selectByValue("LEAD_EMPLOYEE");
		
		
		el = driver.findElement(By.id("marketingCampaignId"));
		drpdwn = new Select(el);
		drpdwn.selectByIndex(6);
		
		el = driver.findElement(By.id("generalStateProvinceGeoId"));
		drpdwn = new Select(el);
		drpdwn.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		String account = driver.findElement(By.xpath("//span[@class ='tabletext']")).getText();
		System.out.println(account);
		if(account.contains(uname))
		{
			System.out.println("Account name verified correctly");
		}
		else
		{
			System.out.println("Account name is incorrect");
		}
			
		//driver.close();
		
		
		
		



	}

}
