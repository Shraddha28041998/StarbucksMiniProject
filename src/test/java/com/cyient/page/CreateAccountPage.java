package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {
	private By joinLocator = By.xpath("//a[text()='Join now']");
	private By firstnameLocator=By.id("firstName");
	private By lastnameLocator=By.id("lastName");
	private By emailLocator=By.id("emailAddress");
	private By passwordLocator=By.id("password");
	private By createLocator=By.xpath("//button[normalize-space()='Create account']");
	private By errorLocator=By.xpath("//span[text()='Please agree to the Terms of Use']");
	private WebDriver driver;

	public CreateAccountPage (WebDriver driver) {
		this.driver = driver;
	}

	public void selectJoin() {
		driver.findElement(joinLocator).click();
	}
	
	public void sendfirstName(String fname) {
		driver.findElement(firstnameLocator).sendKeys(fname);
	}
	public void sendLastName(String lname) {
		driver.findElement(lastnameLocator).sendKeys(lname);
	}
	public void sendMail(String mail) {
		driver.findElement(emailLocator).sendKeys(mail);
	}
	public void sendPassword(String pass) {
		driver.findElement(passwordLocator).sendKeys(pass);
	}
	public void selectCreate() {
		driver.findElement(createLocator).click();
	}
	public String getErrorMessage() {
		return driver.findElement(errorLocator).getText().trim();
	}
	
}
