package com.cucumber.Selenium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.Constants;

public class BrightTalk implements Constants {

	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;
	
	public void createDriver() throws MalformedURLException, InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(baseURL);
		waitVar = new WebDriverWait(driver, DEFAULT_TIMEOUT);
	}
	
	public void goToURL(String url) {
		 driver.get(url);
	}
	public void teardown() {
		clickElement(EDIT_PROFILE);
		clickElement(DELETE_ME_FROM_BRIGHT_TALK);
		clickElement(DELETE);
		clickElement(YES);
		driver.quit();
	}
	
	public void isHomePageDisplayed() {
		
		assertElementPresent(JOIN_IN, true);
	
	}
	
	public void isLoginPageDisplayed() {
		
		assertElementPresent(LOGIN_TO_BRIGHT_TALK, true);
	
	}
	
	public void isRegisterSuccessful() {
		
		assertElementPresent(PROFILE_ICON, true);
		clickElement(PROFILE_ICON);
		clickElement(EDIT_PROFILE_LINK);		
	
	}
	
	public void isLoginsuccessful() {
		
		assertElementPresent(KNOWLEDGE_FEED, true);
	
	}
	
	public void clickElement(By by) {
		WebElement Ele =  driver.findElement(by);
		if (Ele != null)
			Ele.click();
	}
	
	public void isJoinSectionDisplayed() {
	
		assertElementPresent(FIRST_LEVEL_HEADLINE, true);
		assertElementPresent(FIRST_NAME_INPUT, true);
		assertElementPresent(LAST_NAME_INPUT, true);
		assertElementPresent(EMAIL_ADDRESS_INPUT, true);
		assertElementPresent(TIME_ZONE_SELECT, true);
		assertElementPresent(PASSWORD_INPUT, true);
	
	}
	
	public WebElement getElement(By by) {
		WebElement Ele = driver.findElement(by);
		return Ele;
	}
	
	public void assertElementPresent(By by, Boolean present_YN) {
		if (present_YN)
			//waitVar.until(ExpectedConditions.presenceOfElementLocated(by));
			try {
				assertTrue(ELEMENT_PRESENT_ERROR_MSG, driver.findElement(by).isDisplayed());
			} catch (Exception e) {
				e.printStackTrace();
			}
		else {
			try {
				assertFalse(ELEMENT_PRESENT_ERROR_MSG, driver.findElement(by).isDisplayed());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
				
	}
	
	public void assertTrue (String errorMsg, boolean assertStringResult) throws Exception {
		if (!assertStringResult) {
			System.out.println(errorMsg);
			throw new Exception (errorMsg);
		}
		
	}
	
	public void assertFalse (String errorMsg, boolean assertStringResult) throws Exception {
		if (assertStringResult) {
			System.out.println(errorMsg);
			throw new Exception (errorMsg);
		}
		
	}

}