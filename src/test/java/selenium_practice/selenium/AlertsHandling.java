package selenium_practice.selenium;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsHandling {

	public static void main(String[] args) throws Exception 
	{
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	      
	    driver.manage().window().maximize();
	    driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	    
        driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("output")).getText());
       
        driver.findElement(By.id("confirmBox")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        System.out.println(driver.findElement(By.id("output")).getText());

        
        driver.findElement(By.id("promptBox")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Hi its me satish");
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("output")).getText());

        
	}
}
