package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	public WebDriver driver;
	
	@Given("user is on facebook login page")
	public void user_is_on_facebook_login_page() {
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	   
	}

	@When("user enters the valid username and invalid password")
	public void user_enters_the_valid_username_and_invalid_password() {
	    
		driver.findElement(By.id("email")).sendKeys("Java");
		
		driver.findElement(By.id("pass")).sendKeys("Jaav@123");
	}

	@Then("user clicks on  the login button")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("user verifies whether it is navigating to home page of the facebook application")
	public void user_verifies_whether_it_is_navigating_to_home_page_of_the_facebook_application() {
	   System.out.println("User moved into Invalid page");
	}

	

}
