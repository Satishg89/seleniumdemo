package selenium_practice.selenium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaits {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        //Here driver waits for the element for maximum of 11 seconds.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
		driver.findElement(By.xpath("//button[@id='btn1']")).sendKeys(Keys.ENTER);
      	driver.findElement(By.xpath("(//input[@id='txt1'])[1]")).sendKeys("Satish");	
      	driver.findElement(By.xpath("//button[@id='btn2']")).click();
      	driver.findElement(By.xpath("(//input[@id='txt2'])[1]")).sendKeys("Gudala");
      
	}
}
