package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ById {
public void launch_Browser()
{
	System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.19.1-win32 (1)\\geckodriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	//driver.navigate().to("http://www.facebook.com");
	//driver.navigate().back();
	System.out.println(driver.getTitle());
	//driver.findElement(By.name("email")).sendKeys("admin");
	//driver.findElement(By.name("pass")).sendKeys("admin");
	//driver.findElement(By.id("loginbutton")).click();
	//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin");
	//driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	driver.findElement(By.xpath("//label[contains(@id,'u_0')]")).click();
	driver.findElement(By.className("inputtext")).sendKeys("admin");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ById oo=new ById();
		oo.launch_Browser();
	}

}
