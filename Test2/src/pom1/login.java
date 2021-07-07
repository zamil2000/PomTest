package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.Test;

@Test
public class login {
	public void log()  {
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.phptravles.net/login");
		
		LogTes.userName(driver).sendKeys("user#.com");
		LogTes.password(driver).sendKeys("pass");
		LogTes.submit(driver).click();
				
	}
}
