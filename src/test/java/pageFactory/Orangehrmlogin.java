package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orangehrmlogin {
	WebDriver driver;
	
	public Orangehrmlogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}    
	
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	@FindBy(xpath="(//img[@src='/web/images/ohrm_logo.png'])[2]") WebElement logo;
	@FindBy(xpath = "//input[@name='username']") WebElement username; 
	@FindBy(xpath = "//input[@name='password']") WebElement password; 
	@FindBy(xpath = "//button[@type='submit']") WebElement loginbutton; 
	
	public boolean logo() {
	   boolean b =logo.isDisplayed();
	   return b;
	} 
	
	public void loginOperation(String user,String pass) throws Exception {
		username.sendKeys(user);
		Thread.sleep(3000);
		password.sendKeys(pass);
		Thread.sleep(3000);
		loginbutton.click();
	}
	
}
