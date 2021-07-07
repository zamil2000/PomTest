package pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogTes {
	//username,password,submitbtn
public static WebElement userName(WebDriver driver) {
			return driver.findElement(By.name("username"));
		}

public static WebElement submit(WebDriver driver) {
	return driver.findElement(By.name("oo"));
}
public static WebElement password(WebDriver driver) {
	
	return driver.findElement(By.name("password"));
}

}
