package Assignments_02_06_26;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts_02_06 {
	
	static WebDriver driver;
 @Test
 public void AlertsTest() {
		WebDriverManager.chromedriver().setup();

		try {
			//Launch Chrome browser
			driver = new ChromeDriver();
			// Navigate to selenium practice page
			driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
			
			// Maximize the browser window
	        driver.manage().window().maximize();
	        // Time setting
	        Thread.sleep(4000);
		    
	        // information alert 
		 	WebElement info_alert = driver.findElement(By.xpath("//label[normalize-space()='Click Button to see alert']"));
		 	info_alert.click();
		 	
		 	// pop up is opened and we need to switch the control to the pop up
		 	Alert alt = driver.switchTo().alert();
		 	
		 	//click on ok button on the pop up
		 	alt.accept();
		   // Time setting
		 	Thread.sleep(3000);
		 	
		 	// confirmation alert
		    WebElement confirm_alert = driver.findElement(By.xpath("//label[normalize-space()='On button click, confirm box will appear']"));
		 	
		 	confirm_alert.click();
		 	// click on cancel button on the pop up
		 	Alert alt1 = driver.switchTo().alert();
           
		 	// click on cancel button on the pop up
		 	alt1.dismiss();
		 	// Time setting
		 	Thread.sleep(4000);
		 	
		 	//prompt alert
		 	WebElement promptalert = driver.findElement(By.xpath("//label[normalize-space()='On button click, prompt box will appear']"));
		 	promptalert.click();
		 	
		 	Alert alt2 = driver.switchTo().alert();
			//send some to text to prompt button
		 	alt2.sendKeys("Selenium Webdriver");
		 	// click on ok button on the pop up
		 	alt2.accept();
		
}catch (Exception e)
		{
			e.printStackTrace();
		} 
		}

	}
