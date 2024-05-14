/**
 * 
 */
package com.orangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.orangeHRM.base.BaseClass;

/**
 * 
 */
public class LoginPage extends BaseClass {

	By username = By.name("username");
	By password = By.name("password");
	By submit = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    By logo = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[1]/img");
    
	
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public Boolean verifyLogoDisplyed() {
		Boolean flag = driver.findElement(logo).isDisplayed();
		
		return flag;
		
	}
	public void login(String uname, String pwd) {

		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pwd);

		driver.findElement(submit).click();
		
		

	}
}
