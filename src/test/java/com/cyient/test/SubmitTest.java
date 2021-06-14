package com.cyient.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.SignupPage;
import com.cyient.page.submitPage;

public class SubmitTest extends WebDriverWrapper {
@Test

	public void ideaTest() {
	
	//signUppage
	SignupPage click =new SignupPage(driver);
	click.passCookie();
	click.popUp();
	
	
	
	
	
	//submitPage
	submitPage data =new submitPage(driver);
	data.submitIdea();
	data.sendfirstName("shraddha");
	data.sendlastName("Hiwarkar");
	data.sendeMail("h2@gmail.com");
	data.selectRelated();
	data.selectOption();
	data.selectAbout();
	data.sendData("improve quality");
	data.selectSubmit();
	String actualValue = data.getErrorMessage();
	System.out.println(actualValue);
    Assert.assertEquals(actualValue,data.getErrorMessage());
	
	
	
	
		/*driver.findElement(By.id("truste-consent-button")).click();
		driver.findElement(By.xpath("//button[@class='sb-button sb-button--text m1']")).click();
	    driver.findElement(By.linkText("Submit Your Idea")).click();
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("shraddha");
		driver.findElement(By.xpath("//input[@placeholder='Last name']")).sendKeys("Hiwarkar");
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("h2@gmail.com");
		driver.findElement(By.xpath("//select[@name='RelatesTo']")).click();
		driver.findElement(By.xpath("//option[@value='Coffee Drinks']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='An improvement to existing']")).click();
		
		driver.findElement(By.xpath("//textarea[@placeholder='Share your idea in 500 characters or less']")).sendKeys("sahjdhsd  asjhdj jhadljsd hjkadhja hjdshjka");
	
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Accepting terms is required']")).click();*/
	}
}
