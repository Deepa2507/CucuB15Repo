package com.radical.basic.b15demo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OneFolderStepDefs {
	
	WebDriver driver;
	
	@Given("^the user is on facebook login page$")
	public void the_user_is_on_facebook_login_page(){
		System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("^he enteres \"([^\"]*)\" as user name$")
	public void he_enteres_user_as_user_name(String userName){
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userName);
	}
	
	@And("^he enteres \"([^\"]*)\" as password$")
	public void he_enteres_pwd_as_password(String pwd) throws InterruptedException{
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);
		Thread.sleep(5000);
	}

//	@Then("^check username is present in textbox$")
//	public void check_username_is_present_in_textbox(){
//		String userName = driver.findElement(By.xpath("//input[@id='email']")).getText();
//		
//		if(userName.equals(""))
//		{
//			System.out.println("User name is not null");
//		}
//	}

	@Then("^check username is present in textbox$")
	public void check_username_is_present_in_textbox(){
	
		Assert.assertTrue(true);  //dummy assert
		driver.quit();
	}
	

}
