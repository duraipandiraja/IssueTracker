package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	WebDriver driver;

@Given("^Open chrome and start application$")
public void open_chrome_and_start_application() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\PACSS AUTO\\PACSS\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("http://intranet.protechsolutions.com/issuetracker/Login.aspx");
	Thread.sleep(3000);

}


@When("^I Enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_Enter_valid_and(String arg1, String arg2) throws Throwable {
	driver.findElement(By.id("txtLoginID")).sendKeys("duraipandi");
	driver.findElement(By.id("txtPassword")).sendKeys("duraipandi");
	driver.findElement(By.id("btnLogin")).click();
	System.out.println("duraipandiraja");
	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.id("btnLogin")).click();
    
}




@Then("^user should be able to login successfully$")
public void user_should_be_able_to_login_successfully() throws Throwable {
   System.out.println("login successfully");
    
	}

}
