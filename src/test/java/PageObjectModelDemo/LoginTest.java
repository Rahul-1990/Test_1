package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//create object og loginpage class
		
		LoginPage2 pg = new LoginPage2(driver);
		
		driver.get("https://www.saucedemo.com/");
		
		pg.enterUsername("standard_user");
		pg.enterPassword("secret_sauce");
		pg.ClickOnLoginBtn();
		

		

	}

}
