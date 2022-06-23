package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//without using pageFactory

public class LoginPage {
	
	WebDriver driver;
	
	LoginPage(WebDriver d){
		
		driver=d;
	}
	
	//locate webelemrnt
	
	By username = By.xpath("//input[@id='user-name']");
	By password = By.xpath("//input[@id='password']");
	By loginBtn = By.xpath("//input[@id='login-button']");
	
	
	public void enterUsername(String name) {
		
		driver.findElement(username).sendKeys(name);
	}
	
	public void enterPassword(String Password) {
		
		driver.findElement(password).sendKeys(Password);
		
	}
	
	public void ClickOnLoginBtn() {
		
		driver.findElement(loginBtn).click();
		
	}

	


}
