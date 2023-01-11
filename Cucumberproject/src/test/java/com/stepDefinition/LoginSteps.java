package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

WebDriver driver;
	
@Given("user is on login page")
public void user_is_on_login_page() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
//	driver.manage().deleteAllCookies();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    
}

@When("user enters username and password")
public void user_enters_username_and_password() {
	
	WebElement element;
	//Webdriver driver;
	WebDriverWait wait = new WebDriverWait(driver, 100);
	element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Username']")));
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
    
}

@And("click on login button")
public void click_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.tagName("button")).click();
}

@Then("user should land on home page")
public void user_should_land_on_home_page() {
    // Write code here that turns the phrase above into concrete actions
    
	 
	//driver.close();
}
}
