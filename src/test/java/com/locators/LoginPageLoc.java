package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class LoginPageLoc extends BaseClass {

	public LoginPageLoc() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	private WebElement username;

	public WebElement getusername() {
		return username;
	}

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	public WebElement getpassword() {
		return password;
	}

	@FindBy(xpath = "//button[@value='1']")
	private WebElement login;

	public WebElement getlogin() {
		return login;
	}

}
