package pageFactorytest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.Orangehrmlogin;
import pageFactory.UserHomePage;

public class PageFactoryTest {
	Orangehrmlogin log;
	WebDriver driver;
	UserHomePage homepage;
	@BeforeTest
	public void  setup()  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
	@Test(priority=1)
	public void login() throws Exception {
		log = new Orangehrmlogin(driver);
		Thread.sleep(5000);
		boolean logo =log.logo();
		Assert.assertTrue(logo);
		log.loginOperation("Admin", "admin123");
	}
	@Test(priority=2)
	public void validateuser() {
	homepage = new UserHomePage(driver);
	String actual = homepage.validteuserpage();
	String expected ="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	Assert.assertEquals(actual,expected);
	System.out.println("Login succesfull");
	}
	@AfterTest(enabled=false)
	public void quit() {
		driver.quit();
	}
}
