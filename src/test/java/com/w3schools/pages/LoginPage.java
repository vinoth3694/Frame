package com.w3schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.w3schools.utils.Sewrappers;

public class LoginPage extends Sewrappers {
	
	@FindBy(id="modalusername")
	public WebElement username;
	
	@FindBy(xpath="//input[@name='current-password']")
	public WebElement password;
	
	@FindBy(xpath="//span[text()='Log in']")
	public WebElement loginButton;
	
	
	public void setUserName(String user)
	{
		waitForElement(username,20);
		typeText(username,user);
	}
	
	public void setPassword(String pwd)
	{
		waitForElement(password,20);
		typeText(password,pwd);
	}
	
	public void clickLogin()
	{
		waitForElement(loginButton,20);
		clickElement(loginButton);
	}
	

}

