package pom.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class TakeScrrenShot {
	
	@Test
	
	public void Test_001() throws IOException {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		String rs = RandomString.make(3);
		
		/*TakesScreenshot ts = (TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\RAHUL\\eclipse-workspace\\Project_1\\ScreenShot\\FbModel\\"+rs+".png");
		FileUtils.copyFile(src, dst);*/
		
	    WebElement ele = driver.findElement(By.xpath("//a[@title='Marathi']"));
		File src =ele.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\RAHUL\\eclipse-workspace\\Project_1\\ScreenShot\\FbModel\\"+rs+".png");
		FileUtils.copyFile(src, dst);
	}

}
