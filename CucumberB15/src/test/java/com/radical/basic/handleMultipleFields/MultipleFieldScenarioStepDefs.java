package com.radical.basic.handleMultipleFields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class MultipleFieldScenarioStepDefs {
	
	protected WebDriver driver;
	
		
	@Given("^the user is on facebook login page$")
	public void the_user_is_on_facebook_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
	}

	@When("^he enteres \"([^\"]*)\" as first name$")
	public void he_enteres_as_first_name(String userName) throws Throwable {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(userName);
	}

	@When("^he enteres \"([^\"]*)\" as Surname$")
	public void he_enteres_as_Surname(String surname) throws Throwable {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(surname);
	}

	@When("^he enteres (\\d+) as mobile number$")
	public void he_enteres_as_mobile_number(int mobileNumber) throws Throwable {
		String mobileNo = Integer.toString(mobileNumber);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(mobileNo); 
	}

	@When("^he enteres \"([^\"]*)\" as new password$")
	public void he_enteres_as_new_password(String password) throws Throwable {
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(password);
	}

	@When("^he enteres (\\d+) as birth date$")
	public void he_enteres_as_birth_date(int day) throws Throwable {
		 WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
	     Select sel = new Select(element);
		 sel.selectByVisibleText(Integer.toString(day));
	}

	@When("^he enteres \"([^\"]*)\" as birth month$")
	public void he_enteres_as_birth_month(String month) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//select[@id='month']"));
	     Select sel = new Select(element);
		 sel.selectByVisibleText(month);
	}

	@When("^he enteres (\\d+) as birth year$")
	public void he_enteres_as_birth_year(int year) throws Throwable {
		 WebElement element = driver.findElement(By.xpath("//select[@id='year']"));
	     Select sel = new Select(element);
		 sel.selectByVisibleText(Integer.toString(year));
	}

	@When("^he selects \"([^\"]*)\" as gender$")
	public void he_selects_as_gender(String gender) throws Throwable {
		//driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
		String xpath = "//label[contains(text(), " + "'" + gender + "'" + " )]";
		System.out.println("xpath --->" + xpath);
		driver.findElement(By.xpath(xpath)).click();
		
	}

}
