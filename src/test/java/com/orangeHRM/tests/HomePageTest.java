/**
 * 
 */
package com.orangeHRM.tests;

import org.testng.Assert;

import com.orangeHRM.base.BaseClass;
import com.orangeHRM.pages.HomePage;

/**
 * 
 */
public class HomePageTest extends BaseClass {

	HomePage homepage;
	
	//LoginPage loginpage;
	public void admintabTest() {
		loginpage.login("Admin", "Admin");
		homepage.clickOnAdminTab();
		String actURL = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
		String expURL = driver.getCurrentUrl();
		Assert.assertEquals(actURL, expURL);
		
	}
}
