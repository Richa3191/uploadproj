package testNG;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	String str="Facebook Demo";
  @Test
  public void f() {
	System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.19.1-win32 (1)\\geckodriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	String st=driver.getTitle();
	Assert.assertEquals(st, str);
	System.out.println("correct page");
  }
}
