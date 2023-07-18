package selenium_practice.selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleWebElements {
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//List with WebElemnt holds the multiple we elements using findElements() method of driver
		List<WebElement> eles = driver.findElements(By.xpath("//a"));
		for(int i=0;i<eles.size();i++)
		{
			System.out.println(eles.get(i).getAttribute("href"));
		}	  
	}
}

