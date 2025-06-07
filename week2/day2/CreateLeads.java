package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLeads {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Origen1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priyadharsini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Muthusamy");
		String title = "Selenium Tester";
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(title);
		driver.findElement(By.xpath("//input[@name = 'submitButton']")).click();
		if(driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText().equals(title))
		{
			System.out.println("Title-match");
		}
		else
			System.out.println("Title - No match");
		driver.close();
	}

}
