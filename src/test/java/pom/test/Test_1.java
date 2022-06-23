package pom.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageObject.LoginPom;

import pom.utility.BaseClass;

public class Test_1 extends BaseClass {
	
	@Test
	public void Test_001() {
		
		LoginPom login = PageFactory.initElements(driver,LoginPom.class);
		login.getEmail_txt().sendKeys("Rahul");
		login.getPass_txt().sendKeys("12345");
	}
	
	@Test
	public void Test_002() {
		
		LoginPom login = PageFactory.initElements(driver,LoginPom.class);
		login.getEmail_txt().sendKeys("Rahul@.gmail");
		login.getPass_txt().sendKeys("123459876");
	
	
	}
	@Test
	public void Test_003() {
		
		LoginPom login = PageFactory.initElements(driver,LoginPom.class);
		login.getEmail_txt().sendKeys("Rahul007@.gmail.com");
		login.getPass_txt().sendKeys("1256340982618");
	}
	

}
