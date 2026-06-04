package Assignments_01_06_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register_Selenium_Tutorial {
	static WebDriver driver;
	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	try {
		//Launch browser
		driver = new ChromeDriver();
		// Navigate to registration page
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Setting time
		Thread.sleep(4000);
		
		// Enter the first name
		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstname']"));
		firstname.sendKeys("Nomu");
		// Enter the last name
		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastname']"));
		lastname.sendKeys("Thanneru");
		// Enter the user mail id
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		
		username.sendKeys("nomunt451.t@gmail.com");
		// Enter the password
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		
		password.sendKeys("******");
		//Register the form
        WebElement register = driver.findElement(By.xpath("//input[@value='Register']"));
        register.click();
        
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String ExpectedTitle = "tutorialspoint";
		
		if(title.equals(ExpectedTitle))
		{
			// Success message
			System.out.println("Login Successful on tutorialspoint.com-selenium-practice-register");
		}
		else 
		{
			// Success message
			System.out.println("Login not Successful on tutorialspoint.com-selenium-practice-register");
		}
	}catch (Exception e)
	{
		e.printStackTrace();
	}

}
}
