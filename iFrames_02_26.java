package Assignments_02_06_26;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrames_02_26 {
	static WebDriver driver;
	@Test
    public  void iFrameTest() {
			WebDriverManager.chromedriver().setup();

			try {
				//Launch Chrome browser
				driver = new ChromeDriver();
				// Navigate to selenium practice page
				driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
				
				// Maximize the browser window
		        driver.manage().window().maximize();
		        // Time setting
		        Thread.sleep(4000);
		        // switch the frame
		        driver.switchTo().frame(1);
		        // create the required frame
		       WebElement frame = driver.findElement(By.xpath("//a[normalize-space()='']//*[name()='svg']"));
			 	// click frame
		       frame.click();
			}catch (Exception e)
			{
				e.printStackTrace();
			} 
			}

		}
