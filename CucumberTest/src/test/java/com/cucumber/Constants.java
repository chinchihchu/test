package com.cucumber;

import org.openqa.selenium.By;

public interface Constants {

	public static final String CHANGE_REQUEST = "change_request";
	public static final String CHANGE_TASK = "change_task";
	public static final By JOIN_IN = By.xpath("//a[contains(@class,'sign-up-link btn btn-primary btn-lg') and contains(text(),'Join now')]");
	public static final By EDIT_PROFILE = By.xpath("//a[contains(@class,'btn btn-tertiary profile-edit-link') and contains(text(),'Edit profile')]");
	public static final By EDIT_PROFILE_LINK = By.xpath("//a[contains(@class,'profile-menu-edit-profile-link')]");
	public static final By LOGO_ICON = By.xpath("//img[contains(@class,'logo') and contains(@title,'BrightTalk')]");
	public static final By JOIN_BRIGHTTALK = By.xpath("//h1[contains(text(),'Join BrightTALK™ for free')]");
	public static final By DELETE_ME_FROM_BRIGHT_TALK = By.xpath("//a[contains(@class,'bulletlink') and contains(text(),'Delete me from BrightTALK™')]");
	public static final By DELETE = By.xpath("//input[contains(@class,'button button-delete') and contains(@type,'submit')]");
	public static final By LOG_IN = By.xpath("//input[contains(@class,'login-button') and contains(@type,'submit')]");
	public static final By YES = By.xpath("//span[contains(@class,'ui-button-text') and contains(text(),'Yes')]/parent::button");
	public static final By PROFILE_ICON = By.xpath("//img[contains(@class,'profile-area-user-image')]");
	public static final By RETURN_TO_MY_BRIGHT_TALK = By.xpath("//a[contains(@class,'BTButton button2 myBrighttalkButton') and contains(text(),'Return to My BrightTALK')]");
	public static final By FIRST_LEVEL_HEADLINE = By.className("first-level-headline");
	public static final By FIRST_NAME_INPUT = By.id("user_registration_first_name");
	public static final By LAST_NAME_INPUT = By.id("user_registration_last_name");
	public static final By EMAIL_ADDRESS_INPUT = By.id("user_registration_email_address");
	public static final By TIME_ZONE_SELECT = By.id("user_registration_timezone");
	public static final By PASSWORD_INPUT = By.id("user_registration_password");
	public static final By JOIN = By.xpath("//button[contains(@type,'submit') and contains(text(),'Join')]");
	public static final By LOGIN_TO_BRIGHT_TALK = By.xpath("//h1[contains(@class,'first-level-headline') and contains(text(),'Log in to BrightTALK™')]");
	public static final By KNOWLEDGE_FEED = By.xpath("//h1[contains(@class,'page-title') and contains(text(),'Knowledge feed')]");
	public static final By LOGIN = By.xpath("//a[contains(@class,'regular-login-link btn btn-link') and contains(text(),'Log in')]");
	public static final By USER_LOGIN_EMAIL_INPUT = By.id("user_login_email");
	public static final By USER_LOGIN_PASSWORD_INPUT = By.id("user_login_password");
	public static final By PROFILE_CARD_NAME = By.xpath("//li[contains(@class,'profile-card-detail profile-card-name')]");
	
	public static final By PROFILE_LAST_NAME_INPUT = By.id("edit-field2");
	public static final By PROFILE_TELEPHONE_INPUT = By.id("edit-field4");
	public static final By PROFILE_JOB_TITLE_INPUT = By.id("edit-field5");
	public static final By PROFILE_LEVEL_SELECT = By.id("edit-field6");
	public static final By PROFILE_COMPANY_INPUT = By.id("edit-field7");
	public static final By PROFILE_COMPANY_SIZE_SELECT = By.id("edit-field8");
	public static final By PROFILE_INDUSTRY_SELECT = By.id("edit-field9");
	public static final By PROFILE_COUNTRY_SELECT = By.id("edit-field11");
	public static final String ELEMENT_PRESENT_ERROR_MSG = "Element should not present";
	public static final String ELEMENT_NOT_PRESENT_ERROR_MSG = "Element does not present";
	public static final By SAVE_CHANGE = By.id("edit-submit-editprofile");
	
	public static String baseURL = "https://www.brighttalk.com/";
	public static String knowledgeFeedURL = "https://www.brighttalk.com/mybrighttalk/knowledge-feed";
	public final static String JOIN_NOW = "Join Now";
	public final static String PROFILE_CARD_NAME_NOT_FOUND_ERROR_MESSAGE = "Profile card name element not found";
	public final int DEFAULT_TIMEOUT = 15;
}
