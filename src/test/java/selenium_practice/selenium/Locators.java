package selenium_practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	// This program is about locators used in selenium.
	    public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		highlight(driver, driver.findElement(By.id("autocomplete")));
	
		highlight(driver, driver.findElement(By.name("show-hide")));
		
		highlight(driver, driver.findElement(By.className("pull-right")));
		
		highlight(driver,driver.findElement(By.linkText("Open Tab")));
		
		highlight(driver,driver.findElement(By.partialLinkText("Ho")));
		
		highlight(driver,driver.findElement(By.tagName("h1")));
		
		//highlight(driver,driver.findElement(By.cssSelector("")));
		
		highlight(driver,driver.findElement(By.xpath("//button[@id='openwindow']")));
	}

	// JavaScript executor method to highlight selected element

	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')",
				element);
	}
}
