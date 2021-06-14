package com.cyient.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.MenuTestPage;
import com.cyient.page.SignupPage;

public class MenuTest  extends WebDriverWrapper {
	@Test
	
	
	public void validateTest() throws InterruptedException 
	{
		SignupPage select =new SignupPage(driver);
		select.passCookie();
		select.popUp();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		MenuTestPage menu=new MenuTestPage(driver);
		menu.selectMenu();
		js.executeScript("scroll(0,400)");
		menu.selectBakery();
		js.executeScript("scroll(0,800)");
		Thread.sleep(3000);
		menu.selectUnicorn();
		Thread.sleep(3000);
		String actualValue = menu.textmsg();
		System.out.println(actualValue);
		String expectedValue ="Creamy vanilla cake with confetti sprinkles shaped into a unicorn, dipped in a white chocolaty icing and finished with a magical design.";
		assertEquals(expectedValue,actualValue);
	    
	
		/*driver.findElement(By.id("truste-consent-button")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Not Now')]")).click();
		driver.findElement(By.xpath("//li[@class='sb-globalNav__desktopListItem']")).click();
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Bak')]")).click();
		((JavascriptExecutor)driver).executeScript("scroll(0,800)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@data-e2e='Unicorn Cake Pop']")).click();
		Thread.sleep(3000);
		String actualValue = driver.findElement(By.xpath("//div[@class='respectTextLineBreaks___x9mja md-pb2 lg-pb0']")).getText();
		System.out.println(actualValue);
		String expectedValue ="Creamy vanilla cake with confetti sprinkles shaped into a unicorn, dipped in a white chocolaty icing and finished with a magical design.";
		assertEquals(expectedValue,actualValue);*/
		
		
		
	}
}
