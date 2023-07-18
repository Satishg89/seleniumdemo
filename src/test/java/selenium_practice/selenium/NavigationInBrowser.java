package selenium_practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationInBrowser {

	public static void main(String[] args) throws Exception
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	Actions mouse = new Actions(driver);
	driver.manage().window().maximize();
	driver.get("https://google.com");
	driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("https://www.facebook.com/login/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
    driver.navigate().to("https://www.facebook.com/login/");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("satish@gmail.com");
    Thread.sleep(4000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ENTER);
	Thread.sleep(4000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	}
}
