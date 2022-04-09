package org.testing.stepdefinitions;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class TestCase1
{
	ChromeDriver driver;
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver","../Project_1/chromedriver.exe");	
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Options op=driver.manage();
		Window w=op.window();
		w.maximize();
	}

	@When("^user enter the username$")
	public void user_enter_the_username() throws Throwable {
	   
	}

	@When("^user enter the password$")
	public void user_enter_the_password() throws Throwable {
	  
	}
	@When("^user do the signup$")
	public void user_do_the_signup() throws Throwable {
	   
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
	  
	}


}
