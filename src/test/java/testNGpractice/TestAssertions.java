package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAssertions {
	@Test
	public void assertionEx() throws Exception 
	{
	   WebDriverManager.chromedriver().setup();
	   ChromeDriver driver = new ChromeDriver();
	   driver.get("https://www.google.com/");
	   driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("facebook",Keys.ENTER);
	   String expectedtitle ="facebook - Google Search";
	   
	  
	   //Thid below Assertion is Hard assertion when we Assert class it will check the given condition 
	   //Is true or false if its fails the execution will stop. the statemnet is not exectued. 
	   
	   Assert.assertEquals(driver.getTitle(), expectedtitle,"Test not successfull");
	   
	   System.out.println(driver.getTitle());
	   
	   Thread.sleep(3000);
	   String expectedtitle2 ="facebook - Google Searchiiiiiii";
	   SoftAssert softassert = new SoftAssert();
	   //This below assertion technique is also called as (VERIFY).
	   //This is a soft assertion performed by SoftAssert class.
	   softassert.assertEquals(driver.getTitle(), expectedtitle2, "soft assert Test not successfull\n");
	   System.out.println("Hi frnds");
	   Thread.sleep(3000);
	   driver.quit();
	   
	   //In soft we softassert we have to call assertAll() method manually at the end of the Test.
	   //This will throw an excpetions and TextMessage given in assertion statements.
	   //This assert will not throw any exception if all softassert statements are true.
	   softassert.assertAll();
	   
	}
}
