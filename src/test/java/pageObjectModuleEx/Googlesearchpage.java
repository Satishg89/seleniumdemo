package pageObjectModuleEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Googlesearchpage {

	WebDriver driver;
	public Googlesearchpage(WebDriver driver) 
	{
		this.driver=driver;
	}
	By searchbox = By.name("q");
	By facebooklink = By.xpath("//div/a/h3[text()='Facebook - log in or sign up']");

	public void searchfacebook(String input) throws Exception {
		driver.findElement(searchbox).sendKeys(input,Keys.ENTER);
		Thread.sleep(5000);
	}

	public void clickonfacebook(){
		try {
			driver.findElement(facebooklink).click();
		}
		catch(Exception e) {
			System.out.println("Exception caught"+e.getMessage());
		}
	}
}
