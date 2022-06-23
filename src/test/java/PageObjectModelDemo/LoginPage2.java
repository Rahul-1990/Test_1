package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//using pageFactory

public class LoginPage2 {
	
	WebDriver driver;
	
	LoginPage2 (WebDriver d){
		
		driver=d;
		
		//this method will create webelement
		PageFactory.initElements(driver, this);
	}
	
	
	//identify webelement
	//identify usename
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	
	//identify password
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	
	//identify loginBtn
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginBtn;
	
	
	
	
	public void enterUsername(String name) {
		
		username.sendKeys(name);
	}
	
	
	public void enterPassword(String name) {
		
		Password.sendKeys(name);
	}
	
	
	public void ClickOnLoginBtn() {
		
		loginBtn.click();	}
	
	
	
	
	

}
