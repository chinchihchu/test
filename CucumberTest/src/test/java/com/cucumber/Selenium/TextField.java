package com.cucumber.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.Constants;

public class TextField extends BrightTalk implements Constants{
	
	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;
	public static final String VALUE = "value";
	
	public void setField(By by, String value) {
		
		WebElement Ele = getElement(by);
		Ele.clear();
		Ele.sendKeys(value);
		
	}
	
	public String getFieldValue(By by) {
		
		WebElement Ele = getElement(by);
		return Ele.getAttribute(VALUE);
		
	}
}
