package com.cucumber.StepDefinitions;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import com.cucumber.Constants;
import com.cucumber.Selenium.Button;
import com.cucumber.Selenium.DropDown;
import com.cucumber.Selenium.BrightTalk;
import com.cucumber.Selenium.TextField;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubLoginSD implements Constants {

    BrightTalk bt = new BrightTalk();
    TextField text = new TextField();
    DropDown dropdown = new DropDown();
    Button button = new Button();
    
    public static final String FIRST_NAME = "Chin-Chih";
    public static final String LAST_NAME = "Chu";
    public static final String UPDATE_LAST_NAME = "Froehlich";
    public static final String EMAIL_ADDR = "chinchih_chu@email.com";
    public static final String PASSWORD = "testpassword1";
    public static final String TIMEZONE = "United Kingdom - London";
   
    @Given("^a registered user login BrightTalk homepage$")
    public void user_register_and_login_brighttalk_website() throws MalformedURLException,
        InterruptedException {
    		bt.createDriver();
        bt.isHomePageDisplayed();
		bt.clickElement(JOIN_IN);
        register();
        bt.Registered_INDEX = true;
        bt.goToURL(knowledgeFeedURL);
        bt.isLoginsuccessful();
    }

    @When("^user update the last name$")
    public void user_update_the_last_name() {
        bt.clickElement(EDIT_PROFILE);
        editProfile();
        bt.clickElement(SAVE_CHANGE);
        bt.clickElement(RETURN_TO_MY_BRIGHT_TALK);        
    }

    @Then("^the updated last name should display correctly on Knowledge Feed page$")
    public void user_last_name_update_in_knowledge_feed_page() throws Exception {
    		WebElement userNameEle = bt.getElement(PROFILE_CARD_NAME);
    		if (userNameEle != null) {
    			String userName = userNameEle.getText();
    			bt.assertTrue("User name incorrect: expected = " + FIRST_NAME + " " + UPDATE_LAST_NAME  + " , actual = " + userName , userName.equals("Chin-Chih Froehlich"));
    		} else
    			bt.assertTrue(PROFILE_CARD_NAME_NOT_FOUND_ERROR_MESSAGE, false);
    		
    		bt.deleteUser();
        bt.teardown();
    }
    
    public void register() {
    		bt.assertElementPresent(JOIN_BRIGHTTALK, true);
    		text.setField(FIRST_NAME_INPUT, FIRST_NAME);
        text.setField(LAST_NAME_INPUT, LAST_NAME);
        text.setField(EMAIL_ADDRESS_INPUT, EMAIL_ADDR);
        text.setField(PASSWORD_INPUT, PASSWORD);
        dropdown.selectOption(TIME_ZONE_SELECT, TIMEZONE);
        bt.clickElement(JOIN);
    }
    
    public void login() {
    	 	text.setField(USER_LOGIN_EMAIL_INPUT, EMAIL_ADDR);
        text.setField(USER_LOGIN_PASSWORD_INPUT, PASSWORD);
        bt.clickElement(LOG_IN);
    }
    
    public void editProfile() {
    	// TODO : declare constants for those strings
    		text.setField(PROFILE_LAST_NAME_INPUT, "Froehlich");
    		text.setField(PROFILE_TELEPHONE_INPUT, "12345678900");
    		text.setField(PROFILE_JOB_TITLE_INPUT, "Engineer");
    		dropdown.selectOption(PROFILE_LEVEL_SELECT, "Other");
    		text.setField(PROFILE_COMPANY_INPUT, "Test Company");
    		dropdown.selectOption(PROFILE_COMPANY_SIZE_SELECT, "2501-4999");
    		dropdown.selectOption(PROFILE_INDUSTRY_SELECT, "Other");
    		dropdown.selectOption(PROFILE_COUNTRY_SELECT, "United Kingdom");
    		
    		
    }
}
