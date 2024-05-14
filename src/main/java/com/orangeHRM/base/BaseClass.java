/**
 * 
 */
package com.orangeHRM.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.orangeHRM.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 */
public class BaseClass {
	
	 public WebDriver driver;
	 public String browser = "chrome";
	 //public LoginPage loginpage;

	@BeforeMethod
	public void setup() {
		
		if(browser == "chrome") {
			WebDriverManager.chromedriver().setup();
			  driver = new ChromeDriver();
			  
		}
		else if(browser == "firefox"){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
	        
	        
	        //Delete all cookies.
	        driver.manage().deleteAllCookies();
	        
	        //Maximize the browser.
	        driver.manage().window().maximize();

	        // Navigate to a website
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        //loginpage = new LoginPage(driver);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
