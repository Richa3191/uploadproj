package HRM_practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;

public class HRM_Demo {
 
  public static WebDriver driver;
  
  @BeforeSuite
  public void beforeSuite() {
  System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.19.1-win32 (1)\\geckodriver.exe");
  driver=new ChromeDriver();
  driver.get("http://172.16.10.77/hrm/login.php");
  String st=driver.getTitle();
  }

  @Test
  public void Test_loginpage()
  {
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin"); 
	driver.findElement(By.name("Submit")).click();
	  
  }
  
  @Test
  public void Test_search()
  {
	  Select sel=new Select(driver.findElement(By.id("loc_code")));
	  sel.selectByValue("Emp. First Name");
	  driver.findElement(By.name("loc_name")).sendKeys("Neha");
	  driver.findElement(By.className("plainbtn")).click();
	 
  }
  
  @AfterSuite
  public void afterSuite() {
  driver.quit();
  }

}
