package Assignments_01_06_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register_Selenium_Tutorial {
	static WebDriver driver;
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	try {
		driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// identify the web element for username and password and enter the credentials
		WebElement firstname = driver.findElement(By.xpath("input[@name='firstname']"));
		firstname.sendKeys("Nomu");
		
		WebElement lastname = driver.findElement(By.xpath("input[@name='lastname']"));
		lastname.sendKeys("Thanneru");
		
		WebElement username = driver.findElement(By.xpath("input[@name='username']"));
		
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("input[@name='password']"));
		
		password.sendKeys("admin123");
		
        WebElement register = driver.findElement(By.xpath("input[@name='submit']"));
        register.click();
	}catch (Exception e)
	{
		e.printStackTrace();
	}

}
}
