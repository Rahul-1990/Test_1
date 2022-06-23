package com.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom  {
	
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	 private WebElement Email_txt;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	 private WebElement Pass_txt;

	public WebElement getEmail_txt() {
		return Email_txt;
	}


	public WebElement getPass_txt() {
		return Pass_txt;
	}

	

}
