package com.cucumber.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends BrightTalk {

	public void selectOption(By by, String value) {
		Select theSelector = new Select(getElement(by));
		theSelector.selectByVisibleText(value);
	}
	
	public void click() {
		
	}
}
