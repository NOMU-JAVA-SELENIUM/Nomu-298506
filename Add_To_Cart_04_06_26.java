package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_To_Cart_04_06_26{

	static WebDriver driver;
	
	By cart1 = By.xpath("//input[@value='Add to cart' and contains(@onclick,'/catalog/31/')]");
	public void addcart(){
		
		WebDriverManager.chromedriver().setup();
		
		try {
			driver =new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			Thread.sleep(4000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,600);");
			
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(3));
			driver.findElement(cart1).click();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
