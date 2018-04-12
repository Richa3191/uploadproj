package SelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	 public void loadbrowser()
	 
	 {
		 System.setProperty("Wbdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (2)");
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://www.facebook.com");
		 
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo oo= new Demo();
		oo.loadbrowser();
		

	}

}
