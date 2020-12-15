package StepDefinitions;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.*;

public class CreateNewUser {
	
	WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, 25);
    
       
	@Given("^User is on Jobs login page$")
	public void user_is_on_jobs_login_page() {
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	}
	
	@When("^user enters username and password$")
	public void Userentersusernameandpassword() {
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
	}
	
   @Then("^Navigate to users and create a user$")
   public void createuser() {
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Users']")));
	   driver.findElement(By.xpath("//div[text()='Users']")).click();
	   driver.findElement(By.linkText("Add New")).click();
	   driver.findElement(By.id("user_login")).sendKeys("Patrick Patrick");
	   driver.findElement(By.id("email")).sendKeys("patrick@xyz.com");
	   driver.findElement(By.id("createusersub")).click();
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[@class='wp-heading-inline']")));
	   driver.findElement(By.xpath("//input[@id='user-search-input']")).sendKeys("Patrick Patrick");
	   
	   
   }
   @And("^close the browser$")
	public void closeBrowser() {
   	driver.close();
   }
	
}
