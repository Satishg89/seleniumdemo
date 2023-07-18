package pageObjectModuleEx;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Facebookloginpage {
	
	WebDriver driver;
	public Facebookloginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//input[@name='email']") public WebElement ele;
	By email = By.xpath("//input[@name='email']");
	By password = By.xpath("//input[@name='pass']");
	By login = By.xpath("//button[@name='login']");

	public void enterusername(String username) {
		driver.findElement(email).sendKeys(username);
		
	}
    
	public void enterpassword(String pass) throws Exception {
		driver.findElement(password).sendKeys(pass);
		Thread.sleep(3000);
		driver.findElement(login).click();
	}
      
	public void verifylogin(){
		String  actual = driver.getTitle();

		Assert.assertEquals(actual, "Facebook");

	}
}
