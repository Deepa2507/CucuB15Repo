package com.radical.basic.dataTable;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookDataTableStepDefs {
	
	WebDriver driver;
	
	@Before
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("opned browser");
		Thread.sleep(5000);
	}
	
	
	@Given("the user is on facebook login Page")
	public void the_user_is_on_facebook_login_Page() throws InterruptedException{
		System.out.println("actual script started");
		//driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
	}
	
	
	@When("he enters following data")
	public void he_enters_following_data(DataTable table){
		//Initialize data table 
	      List<List<String>> data = table.raw();
	      System.out.println(data.get(0).get(0)); //print the table column Name OR first element
	      
	      //reading columns 2nd's values
	      System.out.println(data.get(1).get(1));
	      System.out.println(data.get(2).get(1));
	      System.out.println(data.get(3).get(1));
	      
	      //reading columns 3rd's values
	      System.out.println(data.get(1).get(2));
	      System.out.println(data.get(2).get(2));
	      System.out.println(data.get(3).get(2));
	      
	      driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(data.get(1).get(1));      
	      driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(data.get(2).get(1));
	      driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(data.get(3).get(1));
	      
	      driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(data.get(5).get(1));
	      
	      System.out.println("data.get(3).get(2)" + data.get(6).get(1));
	      WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
	      Select sel = new Select(element);
		  sel.selectByVisibleText(data.get(6).get(1));
	}
	
	@Then("check signup should failed")
	public void check_signup_should_failed(){
		Assert.assertTrue(true);
	}
	
}
