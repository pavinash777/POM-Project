/**
 * 
 */
package com.orangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.orangeHRM.base.BaseClass;

/**
 * 
 */
public class AdminPage extends BaseClass {

	By adminelement = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");
	By addButton = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
	By userRole = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div");
	By employeeName = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div");
	By status = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div");
	By username = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");
	By password = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
	By confirmPassword = By
			.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");

	By saveButton = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]");
	
	
	
	WebDriver driver;
	LoginPage loginpage;

	public AdminPage(WebDriver driver) {
		this.driver = driver;
	}

	public void userRole(int indexnumber) {
		WebElement adminele = driver.findElement(adminelement);
		Select select = new Select(adminele);
		select.selectByIndex(indexnumber);

	}
	
	public void employeeName(String empName) {

		driver.findElement(employeeName).sendKeys(empName);
	}

	public void status(int indexnumber) {
		WebElement status = driver.findElement(employeeName);
		Select select = new Select(status);
		select.selectByIndex(indexnumber);

	}

	public void username(String username) {

		driver.findElement(employeeName).sendKeys(username);
	}

	public void password(String pass) {

		driver.findElement(employeeName).sendKeys(pass);
	}

	public void confirmPassword(String cpass) {

		driver.findElement(employeeName).sendKeys(cpass);
	}
	
	public void saveButton() {
		driver.findElement(saveButton).click();
		
	}
	
	public void addUser() {
		driver.findElement(adminelement).click();
		driver.findElement(addButton).click();
		userRole(2);
		employeeName("Ravi M B");
		userRole(1);
		username("avinash2345");
		password("password@!777");
		confirmPassword("password@!777");
		saveButton();
	}
	
	

}
