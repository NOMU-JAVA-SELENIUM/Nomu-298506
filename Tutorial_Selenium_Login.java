package Assignments_01_06_26;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Tutorial_Selenium_Login {
	static WebDriver driver;


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		try {
			// Launch browser
			driver = new ChromeDriver();
			// Navigate to registration page
			driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
			
			// Maximize the browser window
			driver.manage().window().maximize();
			// Setting time
			Thread.sleep(4000);
			
			
			// Perform login
			WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
			username.sendKeys("standard_username");
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			password.sendKeys("candidate_password");
			
			WebElement login_button = driver.findElement(By.xpath("//input[@value='Login']"));
			login_button.click();
			Thread.sleep(4000);
			
			String title = driver.getTitle();
			System.out.println(title);
			
			String ExpectedTitle = "Selenium - Automation Practice Form";
			
			if(title.equals(ExpectedTitle))
			{
				// Success message
				System.out.println("Login Successful on tutorialspoint.com");
			}
			else 
			{
				// Success message
				System.out.println("Login not Successful on tutorialspoint.com");
			}
			
			
		}catch (Exception e)
		{
			e.printStackTrace();
		} 
		}
	}


	
