package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
	private By cookieLocator = By.id("truste-consent-button");
	private By popupLocator = By.xpath("//button[@class='sb-button sb-button--text m1']");
	private By signinLocator = By.xpath("//a[text()='Sign in']");
	private By usernameLocator = By.id("username");
	private By signin1Locator = By.xpath("//button[normalize-space()='Sign in']");
	private By errorLocator = By.xpath("//span[contains(text(),'Enter a password.')]");
	private WebDriver driver;

	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}

	public void passCookie() {
		driver.findElement(cookieLocator).click();
	}

	public void popUp() {
		driver.findElement(popupLocator).click();
	}

	public void selectSignin() {
		driver.findElement(signinLocator).click();
	}

	public void selectUsername(String name) {
		driver.findElement(usernameLocator).sendKeys(name);
	}

	public void selectSignIn() {
		driver.findElement(signin1Locator).click();
	}

	public String getErrorMessage() {
		return driver.findElement(errorLocator).getText().trim();
	}
}
