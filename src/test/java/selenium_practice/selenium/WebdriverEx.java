package selenium_practice.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverEx
   {
	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  driver.findElement(By.xpath("//input[@value='radio1']")).click();
	  driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("India");
	  Thread.sleep(3000);
	  List<WebElement> ele = driver.findElements(By.xpath("(//ul[@id='ui-id-1']/li/div)"));
	  for(int i=0;i<ele.size();i++) 
	  {
		if(ele.get(i).getText().equals("India"))
		{
		  	ele.get(i).click();
		}
	  }
	  
	  Select sel = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
	  sel.selectByValue("option1");
	  Thread.sleep(3000);
	  sel.selectByValue("option2");
	 // driver.findElement(By.xpath(""));
	}
}
