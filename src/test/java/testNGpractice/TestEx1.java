package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestEx1 {
	//Here in TestNg class we dont have main() method to run program.
	//In TestNg we Use '@' Annotations and more components to run Test cases.
	//We use annotated methods to run test cases.
	//For EX below @Test annotation will run one test case.
	
	@Test
	public void googletitle() throws Exception 
	{
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.findElement(By.name("q")).sendKeys("hello google",Keys.ENTER);
	  Thread.sleep(5000);
      System.out.println(driver.getTitle());
      driver.quit();
	}
}
