package Assignments_02_06_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Dropdown_02_06 {
	static WebDriver driver;
	@Test
	public  void DropdownTest() {
		WebDriverManager.chromedriver().setup();

		try {
			//Launch Chrome browser
			driver = new ChromeDriver();
			// Navigate to selenium practice page
			driver.get("https://the-internet.herokuapp.com/dropdown");
			
			// Maximize the browser window
	        driver.manage().window().maximize();
	        // Time setting
	        Thread.sleep(4000);
	     // Select option  
	     WebElement Req_Dropdown_option = driver.findElement(By.xpath("//select[@id='dropdown']/option[@value='1']"));
	     // click option
	     Req_Dropdown_option.click();
		}catch (Exception e)
		{
			e.printStackTrace();
		} 
		}

	}

