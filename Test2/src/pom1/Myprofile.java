package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myprofile {
	
public void update() {
	System.setProperty("webdriver.chrome.driver","C:/Users/admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.phptravles.net/login");
	
	LogTes.userName(driver).sendKeys("\"user#.com");
	LogTes.password(driver).sendKeys("pass");
	LogTes.submit(driver).click();
	MyprofileTest.phonenum(driver).sendKeys("90023093");;
	MyprofileTest.city(driver).sendKeys("toronto");
	MyprofileTest.myprofile(driver).click();
	MyprofileTest.click(driver).click();
	
}
}
