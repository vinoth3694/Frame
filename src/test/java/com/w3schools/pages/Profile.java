package com.w3schools.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.w3schools.utils.Sewrappers;

public class Profile extends Sewrappers
{
    @FindBy(id="top-nav-bar-iframe")
    public WebElement frameid;
    
	@FindBy(id ="profile-link")
	public WebElement profileLink;
	
	@FindBy(xpath="//span[text()='Edit']")
	public WebElement editButton;
	
	@FindBy(xpath="//input[@value='estoyVignesh']")
	public WebElement saveButton;
	
	@FindBy(xpath="//button[@class='Button_button__F-5UA Button_primary__nC-4W Nick_action_btn__89VvV']")
	public WebElement Button;
	
	@FindBy(xpath="//div[text()='Bio']")
	public WebElement bioText;
	
	@FindBy(xpath="//textarea[contains(@id,'profile_bio')]")
	public WebElement bio;
	
	@FindBy(xpath="(//div[@class='Button_wrapper__lGxfQ'])[3]")
	public WebElement bioButton;
	
	@FindBy(xpath="//div[text()='Successfully saved public profile']")
	public WebElement alertButton;
	
	public void profileFrame()
	{
		waitForElement(frameid,20);
		selectFrameByWebElement(frameid);
				
	}
	
	public void profilelnk()
	{
		waitForElement(profileLink,20);
		clickElement(profileLink);
		
	}
	
	public void scroll(int srollTo)
	{
		waitForElement(profileLink,20);
		javascriptExecutorScrollToWebelement(srollTo);
		
	}
	
	public void edit()
	{
		waitForElement(editButton,20);
		clickElement(editButton);
		
	}
	
	public void sendKeys(String value)
	{
		waitForElement(saveButton,30);
		typeText(saveButton,value);
		
	}
	
}

