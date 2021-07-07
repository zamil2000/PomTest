package pomPagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login1 {
	@FindBy(name = "username")
public static WebElement username;
	@FindBy(name = "password")
public static WebElement password;
	@FindBy(xpath = "//*[@id='username']")
public static WebElement btn;

}
