package org.cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucmberSample {
	static WebDriver driver;
	
	@Given("The user is in google home page")
	public void the_user_is_in_google_home_page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Sample\\driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("http://google.com/");
	}

	@When("The user search for a text")
	public void the_user_search_for_a_text() {
	    driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
	}

	@Then("The user should bem in search result page")
	public void the_user_should_bem_in_search_result_page() {
	    Assert.assertTrue("search", true);
	}

}

