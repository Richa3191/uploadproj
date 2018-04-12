package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.utility.Xls_Reader;



public class UpdateStatus {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.19.1-win32 (1)\\geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
				
		Xls_Reader reader=new Xls_Reader("D:\\selenium\\Status.xls");
		int count=reader.getRowCount("updatestatus");
				
		for(int i=2;i<=count;i++)
			
						
		{
						
		String Run=reader.getCellData("updatestatus", "RUN", i);
		System.out.println(Run);
		
				
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
			
		driver.quit();

	}

}
