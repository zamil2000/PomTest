package pomPagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {
 public void test()
 {
	 System.setProperty("webdriver.chrome.driver","C:/Users/admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.phptravles.net/login");
		
		
		PageFactory.initElements(driver, Login1.class);
		Login1.username.sendKeys("user");
		Login1.password.sendKeys("passwd");
		Login1.btn.click();
 }
}
