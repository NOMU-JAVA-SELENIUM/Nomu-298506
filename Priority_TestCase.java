package Assignments_02_06_26;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Priority_TestCase {
	static WebDriver driver;
@Test(priority = 1)
public void AlertsTest() {
		WebDriverManager.chromedriver().setup();
		
		   //Launch Chrome browser
			driver = new ChromeDriver();
			// Navigate to selenium practice page
			driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
			
			// Maximize the browser window
	        driver.manage().window().maximize();
	        
		    // information alert 
		 	WebElement info_alert = driver.findElement(By.xpath("//label[normalize-space()='Click Button to see alert']"));
		 	info_alert.click();
		 	
		 	// pop up is opened and we need to switch the control to the pop up
		 	Alert alt = driver.switchTo().alert();
		 	
		 	//click on ok button on the pop up
		 	alt.accept();
		   
		 	// confirmation alert
		    WebElement confirm_alert = driver.findElement(By.xpath("//label[normalize-space()='On button click, confirm box will appear']"));
		 	
		 	confirm_alert.click();
		 	// click on cancel button on the pop up
		 	Alert alt1 = driver.switchTo().alert();
           
		 	// click on cancel button on the pop up
		 	alt1.dismiss();
		 	
		 	//prompt alert
		 	WebElement promptalert = driver.findElement(By.xpath("//label[normalize-space()='On button click, prompt box will appear']"));
		 	promptalert.click();
		 	
		 	Alert alt2 = driver.switchTo().alert();
			//send some to text to prompt button
		 	alt2.sendKeys("Selenium Webdriver");
		 	// click on ok button on the pop up
		 	alt2.accept();
		
}
@Test(priority = 2)
public  void iFrameTest() {
	WebDriverManager.chromedriver().setup();

	    //Launch Chrome browser
		driver = new ChromeDriver();
		// Navigate to selenium practice page
		driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
		
		// Maximize the browser window
        driver.manage().window().maximize();
        
        //WebElement frame = driver.findElement(By.className("fontawesome-i2svg-active fontawesome-i2svg-complete"));
        driver.switchTo().frame(1);
       WebElement radio = driver.findElement(By.xpath("//a[normalize-space()='']//*[name()='svg']"));
	 	radio.click();
	}
@Test(priority=3)
public  void DropdownTest() {
	WebDriverManager.chromedriver().setup();

	
		//Launch Chrome browser
		driver = new ChromeDriver();
		// Navigate to selenium practice page
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		// Maximize the browser window
        driver.manage().window().maximize();
        
        // Select option  
     WebElement Req_Dropdown_option = driver.findElement(By.xpath("//select[@id='dropdown']/option[@value='1']"));
     // click option
     Req_Dropdown_option.click();
}
}

