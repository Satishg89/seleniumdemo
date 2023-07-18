package pageFactory;

import org.openqa.selenium.WebDriver;

public class UserHomePage {
	WebDriver driver;
	public UserHomePage(WebDriver driver) 
	{
		this.driver=driver;
	}
 public String validteuserpage() {
	 String currenturl = driver.getCurrentUrl();
     return currenturl;
 }
}
