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
        
        Thread.sleep(4000);	    // Perform login
	 	WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("visual_user");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		WebElement login_button = driver.findElement(By.xpath("//input[@id='login-button']"));
		login_button.click();
		
		Thread.sleep(4000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String ExpectedTitle = "Swag Labs";
		
		if(title.equals(ExpectedTitle))
		{
			// Success message
			System.out.println("Login Successful on Saucedemo");
		}
		else 
		{
			// Success message
			System.out.println("Login not Successful on Saucedemo");
		}	
		
		
	}catch (Exception e)
	{
		e.printStackTrace();
	} 
	}

}



