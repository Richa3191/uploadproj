package LocatorsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cssSelectorDemo {
	public void launch_Browser() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.19.1-win32 (1)\\geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("admiin");
		//driver.findElement(By.cssSelector("label.uiButton uiButtonConfirm")).click();
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait d=new WebDriverWait(driver, 10);
		d.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name=pass]")));
		driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("admiin");
		
	}	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		cssSelectorDemo cd=new cssSelectorDemo();
		cd.launch_Browser();

	}

}
