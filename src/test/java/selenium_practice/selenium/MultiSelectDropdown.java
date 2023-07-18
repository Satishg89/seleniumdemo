package selenium_practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	
	Select sel =new Select(driver.findElement(By.xpath("(//td/select)[2]")));
	Actions mouse = new Actions(driver);
	//mouse.moveToElement(driver.findElement(By.xpath("(//td/select)[2]"))).perform();

	System.out.println(sel.isMultiple());
	sel.selectByIndex(2);
	sel.selectByIndex(3);
//	sel.deselectByValue(null);
	//sel.selectByVisibleText(null);
	System.out.println(sel.getFirstSelectedOption().getText());
	Thread.sleep(10000);
    sel.deselectAll();
	//driver.close();
	}
}
