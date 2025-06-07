package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("dharsa");
		driver.findElement(By.name("lastname")).sendKeys("pearl");
		

		WebElement el = driver.findElement(By.id("day"));
		Select drpdwn = new Select(el);
		drpdwn.selectByIndex(16);
		
		el=driver.findElement(By.id("month"));
		drpdwn = new Select(el);
		drpdwn.selectByVisibleText("Jul");
		
		el=driver.findElement(By.name("birthday_year"));
		drpdwn = new Select(el);
		drpdwn.selectByVisibleText("1989");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.findElement(By.name("reg_email__")).sendKeys("abc1234@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("abcABC12345");
		driver.findElement(By.name("websubmit")).click();
		
		driver.close();
		
	}

}
