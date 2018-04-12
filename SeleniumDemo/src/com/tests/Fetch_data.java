package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.utility.Xls_Reader;



public class Fetch_data {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				
		Xls_Reader reader=new Xls_Reader("D:\\selenium\\FacebookLogin.xls");
		int count=reader.getRowCount("LoginCredentials");
				
		for(int i=2;i<=count;i++)
			
		{
			
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.19.1-win32 (1)\\geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
			
		String uname=reader.getCellData("LoginCredentials", "UserName", i);
		System.out.println(uname);
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(uname);
		
		String pass=reader.getCellData("LoginCredentials", "Password", i);
		System.out.println(pass);
				 
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(pass);
		
		}
			
		

	}

}
