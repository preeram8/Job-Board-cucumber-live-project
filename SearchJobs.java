package StepDefinitions;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.*;
public class SearchJobs {

	WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, 25);
    
       
	@Given("^User is on Jobs page$")
	public void user_is_on_jobs_page() {
		driver.get("https://alchemy.hguy.co/jobs/jobs");
	}
	
	@When("^Search jobs$")
	public void searchjobs() {
		driver.findElement(By.xpath("//input[@id='search_keywords']")).sendKeys("SDET TESTER");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.id("job_type_freelance")).click();
		driver.findElement(By.id("job_type_internship")).click();
		driver.findElement(By.id("job_type_part-time")).click();
		driver.findElement(By.id("job_type_temporary")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='position']/h3")));
		driver.findElement(By.xpath("//div[@class='position']/h3")).click();
	}
	
	@Then("^Print title and apply for job$")
	public void applyforjob() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[@class='entry-title']")));
		WebElement title = driver.findElement(By.xpath("//h1[@class='entry-title']"));
		System.out.println(title.getText());
		driver.findElement(By.xpath("//input[@class='application_button button']")).click();
		
	}
	
	@And("^close the job site$")
	public void closeBrowser() {
	   	driver.close();
	   }
}
