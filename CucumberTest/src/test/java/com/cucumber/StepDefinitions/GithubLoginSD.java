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
    //Button bt = new Button();
    Button button = new Button();
   
    @Given("^user is on github homepage$")
    public void user_is_on_brighttalk_website() throws MalformedURLException,
            InterruptedException {
        bt.createDriver();
        bt.isHomePageDisplayed();
    }

    @When("^user clicks on Sign in button$")
    public void user_clicks_on_Join_Now_button() {
    		bt.clickElement(JOIN_IN);
        register();
       // bt.clickElement(LOGIN);
       // bt.isLoginPageDisplayed();
        //login();
        bt.goToURL(knowledgeFeedURL);
        //bt.clickElement(LOGO_ICON);
        //bt.clickElement(PROFILE_ICON);
        //bt.clickElement(EDIT_PROFILE_LINK);
        bt.isLoginsuccessful();
        bt.clickElement(EDIT_PROFILE);
        editProfile();
        bt.clickElement(SAVE_CHANGE);
        bt.clickElement(RETURN_TO_MY_BRIGHT_TALK);
        //sf.clickElement(JOIN_IN);
        //register();
        
        
    }

    @Then("^user is displayed login screen$")
    public void user_is_displayed_join_screen() throws Exception {
       // sf.isJoinSectionDisplayed();
    		WebElement userNameEle = bt.getElement(PROFILE_CARD_NAME);
    		if (userNameEle != null) {
    			String userName = userNameEle.getText();
    			bt.assertTrue("User name incorrect", userName.equals("Chin-Chih Froehlich"));
    		} else
    			bt.assertTrue(PROFILE_CARD_NAME_NOT_FOUND_ERROR_MESSAGE, false);
    		
        bt.teardown();
    }
    
    public void register() {
    		text.setField(FIRST_NAME_INPUT, "Chin-Chih");
        text.setField(LAST_NAME_INPUT, "Chu");
        text.setField(EMAIL_ADDRESS_INPUT, "chinchih_chu@email.com");
        text.setField(PASSWORD_INPUT, "testpassword1");
        dropdown.selectOption(TIME_ZONE_SELECT, "United Kingdom - London");
        bt.clickElement(JOIN);
        //button.submit(SUBMIT);
    }
    
    public void login() {
    	 	text.setField(USER_LOGIN_EMAIL_INPUT, "chinchih_chu@email.com");
        text.setField(USER_LOGIN_PASSWORD_INPUT, "testpassword1");
        bt.clickElement(LOG_IN);
        //button.submit(LOG_IN);
    }
    
    public void editProfile() {
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
