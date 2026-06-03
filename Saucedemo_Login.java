package Assignments_01_06_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Saucedemo_Login {	
	static WebDriver driver;

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	try {
		//Launch Chrome browser
		driver = new ChromeDriver();
		// Navigate to saucedemo page
		driver.get("https://www.saucedemo.com/");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		// Perform login
		WebElement username = driver.findElement(By.id("standard_username"));
		username.sendKeys("standard_username");
		
		WebElement password = driver.findElement(By.id("candidate_password"));
		password.sendKeys("candidate_password");
		
		WebElement login_button = driver.findElement(By.id("press_login_button"));
		login_button.sendKeys("press_login_button");
		// Success message
		System.out.println("Login Successful on Saucedemo");
		
		
	}catch (Exception e)
	{
		// Handle exception gracefully
		System.out.println("An error occured during login automation");
		e.printStackTrace();
	} finally {
		if(driver != null) {
			//driver.quit();
		}
	}

}

}