package LOGIN;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import COMMON.GetObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signin extends GetObject{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		GetObject g = new GetObject();
		System.setProperty("webdriver.chrome.driver", "D:\\PACSS AUTO\\PACSS\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://intranet.protechsolutions.com/issuetracker/Login.aspx");
		Thread.sleep(3000);
		driver.findElement(By.id("txtLoginID")).sendKeys("duraipandi");
		driver.findElement(By.id("txtPassword")).sendKeys("duraipandi");
		driver.findElement(By.id("btnLogin")).click();

	}
	
	public String getobject()
	{
		return null;
		
	}

}
