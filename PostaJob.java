package StepDefinitions;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.*;
public class PostaJob {

	WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, 25);
    
       
	@Given("^User is on PostaJob page$")
	public void userisonpostajobpage() {
		driver.get("https://alchemy.hguy.co/jobs");
		driver.findElement(By.xpath("//*[@id=\"menu-item-26\"]/a")).click();
		driver.findElement(By.xpath("//a[@class='button']")).click();
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
	}
	
	@Then("^Post Job info \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void postjobinfo(String JobTitle, String desc, String AppURL, String CompName) {
		
		driver.findElement(By.id("job_title")).sendKeys(JobTitle);
		driver.findElement(By.xpath("//*[@id='job_description_ifr']")).sendKeys(desc);
		driver.findElement(By.id("application")).sendKeys(AppURL);
		driver.findElement(By.id("company_name")).sendKeys(CompName);
		driver.findElement(By.xpath("//input[@class='button secondary save_draft']")).click();
	}
	
	@Then("^Confirm job listing is shown on page$")
	public void confirmjoblisting() {
		driver.findElement(By.xpath("//a[text()='job dashboard']")).click();
		WebElement dashboard = driver.findElement(By.xpath("//h1[@class='entry-title']"));
		System.out.println(dashboard.getText());
		
	}
	
	@And("^Close the jobs browser$")
	public void closeBrowser() {
	   	driver.close();
	   }
	
}
