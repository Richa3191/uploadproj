package testNG;

import org.testng.annotations.Test;

import com.utility.Xls_Reader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class test_update {
	 public static WebDriver driver;

	 @BeforeSuite
	  public void beforeSuite()
	  {
		  System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.19.1-win32 (1)\\geckodriver.exe");
			driver=new ChromeDriver();
			driver.get("http://www.facebook.com");
			System.out.println(driver.getTitle());
			
	  }
	 
  @Test
  public void f() 
 
  {
	  
	  Xls_Reader reader=new Xls_Reader("D:\\selenium\\Status.xls");
		int count=reader.getRowCount("updatestatus");
				
		for(int i=2;i<=count;i++)
			
						
		{
						
		String Run=reader.getCellData("updatestatus", "RUN", i);
		System.out.println(Run);
		System.out.println("driver=" + driver); 
		
				
		if(Run.equalsIgnoreCase("ON"))
		{
			//reader.setCellData( "updatestatus","Status",count, "Passed");
			reader.setCellData("updatestatus","Status",i,"Passed");
			//System.out.println(count);	
		}
		
		else
		{
			continue;
		}
					
		String uname=reader.getCellData("updatestatus", "TestData1", i);
		System.out.println(uname);
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(uname);
		
		String pass=reader.getCellData("updatestatus", "TestData2", i);
		System.out.println(pass);
				 
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(pass);
		
				
  }
  }
  

}
