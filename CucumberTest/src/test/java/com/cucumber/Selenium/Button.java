package com.cucumber.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Button extends BrightTalk {
	
	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;
	
	public void submit(By by) {
		WebElement Ele = getElement(by);
		Ele.click();
	}
}
