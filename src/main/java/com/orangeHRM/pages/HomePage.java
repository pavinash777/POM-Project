/**
 * 
 */
package com.orangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.orangeHRM.base.BaseClass;

/**
 * 
 */
public class HomePage extends BaseClass{

	By adminelement = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	public HomePage() {
		
	}
	
}
