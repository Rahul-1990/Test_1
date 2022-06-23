package pom.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageObject.LoginPom;

import pom.utility.BaseClass;
import pom.utility.Librery;

public class Test_2 extends BaseClass{
	
	
	@Test
	
	public void Test_001() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		Librery.custom_Sendkeys(login.getEmail_txt(), "Test");
		Librery.custom_Sendkeys(login.getPass_txt(), "12345678");
		Librery.getScreenShotCapture();
		
	}

}
