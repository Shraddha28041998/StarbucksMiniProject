package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class submitPage {

	private By ideaLocator= By.linkText("Submit Your Idea");
	private By firstnameLocator=By.xpath("//input[@placeholder='First name']");
	private By lastnameLocator=By.xpath("//input[@placeholder='Last name']");
	private By emailLocator=By.xpath("//input[@placeholder='Email address']");
	private By relatedideaLocator=By.xpath("//select[@name='RelatesTo']");
	private By optionLocator=By.xpath("//option[@value='Coffee Drinks']");
	private By aboutLocator =By.xpath("//label[normalize-space()='An improvement to existing']");
	private By dataputLocator=By.xpath("//textarea[@placeholder='Share your idea in 500 characters or less']");
	private By submitLocator=By.xpath("//input[@type='submit']");
	private By errorLocator=By.xpath("//div[normalize-space()='Accepting terms is required']");
	private WebDriver driver;

	public submitPage (WebDriver driver) {
		this.driver = driver;
	}
	public void submitIdea() {
		driver.findElement(ideaLocator).click();
	}
	public void sendfirstName(String fname) {
		driver.findElement(firstnameLocator).sendKeys(fname);
	}

	public void sendlastName(String lname) {
		driver.findElement(lastnameLocator).sendKeys(lname);
	}

	public void sendeMail(String mail) {
		driver.findElement(emailLocator).sendKeys(mail);
	}

	public void selectRelated() {
		driver.findElement(relatedideaLocator).click();
	}
	
	public void selectOption() {
		driver.findElement(optionLocator).click();
	}
	
	public void selectAbout() {
		driver.findElement(aboutLocator).click();
	}
	public void sendData(String put) {
		driver.findElement(dataputLocator).sendKeys(put);
	}
	public void selectSubmit() {
		driver.findElement(submitLocator).click();
	}
	public String getErrorMessage() {
		return driver.findElement(errorLocator).getText().trim();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}




