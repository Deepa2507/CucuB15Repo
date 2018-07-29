package com.radical.basic.sharedataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedClass {
	
	WebDriver driver;

	
	//@Before
	public WebDriver setup(){
		if(driver==null){
			System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
		
	}
	
	
//	@After
//	public void tearDown(){
//		driver.quit();
//		driver =null;
//	}
//	
//	

}
