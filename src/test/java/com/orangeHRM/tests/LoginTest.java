/**
 * 
 */
package com.orangeHRM.tests;

import org.testng.annotations.Test;

import com.orangeHRM.base.BaseClass;
import com.orangeHRM.pages.LoginPage;

/**
 * 
 */
public class LoginTest extends BaseClass{

	LoginPage loginpage;
	@Test
	public void loginTest() {
		loginpage = new LoginPage(driver);
		loginpage.login("Admin", "admin123");
		
	}
}
