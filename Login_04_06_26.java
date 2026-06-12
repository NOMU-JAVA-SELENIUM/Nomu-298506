package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_04_06_26{
	static WebDriver driver;
	By username = By.xpath("//input[@name='Email']");
	By password =By.xpath("//input[@name='Password']");
	By login = By.xpath("//input[@value='Log in']");
	 
	public void login(String user , String pass) throws InterruptedException{
	WebDriverManager.chromedriver().setup();
		try {
		driver =new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		
		
			Thread.sleep(4000);
		WebElement loginto =driver.findElement(By.xpath("//a[@class='ico-login']"));
		loginto.click();
		
		
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200);");
		Thread.sleep(2000);
		driver.findElement(login).click();
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
