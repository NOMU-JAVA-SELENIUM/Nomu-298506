package SeleniumWebDriver;

import org.testng.annotations.Test;

import pages.AddToCart_04_06_26;
import pages.AddWishlist_04_06_26;
import pages.Login_04_06_26;

public class Login_using_POM_04_06_26{
	@Test(priority=1)
	public void loginTest () throws InterruptedException{
		// TODO Auto-generated method stub
		Login_04_06_26 page =new Login_04_06_26();
		
			page.login("admin00000@gmail.com", "Admin@123");		
	}

	@Test(priority=2)
public void addcart() {
	AddToCart_04_06_26 addcart =new AddToCart_04_06_26();
	addcart.addcart();
	
	
}
	@Test(priority=3)
	public void WishList() {
		AddWishlist_04_06_26 WishList =new AddWishlist_04_06_26();
		WishList.WishList();
}
}
