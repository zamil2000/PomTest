package pom2Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WithoutAtFindby {
	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement btnLogin;
	@Test
public void start()
{
System.setProperty("webdriver.chrome.driver","C:/Users/admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		PageFactory.initElements(driver,WithoutAtFindby.class);
		txtUsername.sendKeys("Admin");
		txtPassword.sendKeys("admin123");
		btnLogin.click();
		
}
}