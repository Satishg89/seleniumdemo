package pageobjectmoduletests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectModuleEx.Facebookloginpage;
import pageObjectModuleEx.Googlesearchpage;

public class Googlesearch {
	Googlesearchpage page;
	Facebookloginpage facebookpage;
	WebDriver driver;
 
@BeforeTest
 public void driversetup() {
	 driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://www.google.com/");
 }
@Test(priority =0)
public void search() throws Exception {
	page = new Googlesearchpage(driver);
	page.searchfacebook("facebook");
    
}
@Test(priority =1)
 public void clickonfacebook() throws Exception {
	 page = new Googlesearchpage(driver);
	 page.clickonfacebook();
	 Thread.sleep(4000);
 }
@Test(priority =2)
public void facebooklogin() throws Exception {
	facebookpage = new Facebookloginpage(driver);
	facebookpage.enterusername("satish");
	facebookpage.enterpassword("satish@123");
	facebookpage.verifylogin();
}

@AfterTest
public void browserquit() {
	driver.quit();
 }
}
