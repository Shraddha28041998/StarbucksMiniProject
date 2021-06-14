package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuTestPage {
	private By menuLocator = By.xpath("//li[@class='sb-globalNav__desktopListItem']");
	private By bakeryLocator=By.xpath("//a[contains(text(),'Bak')]");
	private By unicornLocator=By.xpath("//a[@data-e2e='Unicorn Cake Pop']");
	private By textLocator= By.xpath("//div[@class='respectTextLineBreaks___x9mja md-pb2 lg-pb0']");
	private WebDriver driver;

	public  MenuTestPage(WebDriver driver) {
		this.driver = driver;
	}
	public void selectMenu() {
		driver.findElement(menuLocator).click();
	}
	public void selectBakery() {
		driver.findElement(bakeryLocator).click();
	}
	public void selectUnicorn() {
		driver.findElement(unicornLocator).click();
	}
	public String textmsg() {
		return driver.findElement(textLocator).getText().trim();
	}
}
