package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class FBLoginPage extends Base {

	public FBLoginPage() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(xpath = "//*[@name='login']")
	private WebElement login;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	

}
