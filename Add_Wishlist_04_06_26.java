package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_Wishlist_04_06_26 {
 static WebDriver driver;
 
 public void WishList() {
	 WebDriverManager.chromedriver().setup();
	 try {
		 
		 driver =new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 WebElement Wishlist =driver.findElement(By.xpath("//span[@class='cart-label' and text()='Wishlist']"));
		 Wishlist.click();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	 
 }
}
