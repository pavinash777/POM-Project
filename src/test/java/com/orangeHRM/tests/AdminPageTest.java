/**
 * 
 */
package com.orangeHRM.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.orangeHRM.base.BaseClass;
import com.orangeHRM.pages.AdminPage;
import com.orangeHRM.pages.LoginPage;

/**
 * 
 */
public class AdminPageTest extends BaseClass {

	AdminPage adminPage;
	LoginPage loginpage;
	//WebDriver driver;

	@Test
	public void addUserTest() {

		loginpage = new LoginPage(driver);
		loginpage.login("Admin", "admin123");
		
		//adminPage = new AdminPage(driver);

		//adminPage.addUser();
		
		//driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		
		
	}
}
