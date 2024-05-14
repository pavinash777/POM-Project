/**
 * 
 */
package com.orangeHRM.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangeHRM.base.BaseClass;
import com.orangeHRM.pages.HomePage;
import com.orangeHRM.pages.LoginPage;

/**
 * 
 */
public class LoginTest extends BaseClass{

	LoginPage loginpage;
	HomePage homepage;
	
	
	/*@Test
	public void verifyLogo() {
		loginpage = new LoginPage(driver);
		Boolean bool = loginpage.verifyLogoDisplyed();
		Assert.assertTrue(bool, "Logo is displaying");
	}*/
	@Test(priority = 1)
	public void loginTest() {
		loginpage = new LoginPage(driver);
		loginpage.login("Admin", "admin123");
		String expURL ="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actURL = driver.getCurrentUrl();
		Assert.assertEquals(expURL, actURL, "Page URL is matched");
	}
	
	
}
