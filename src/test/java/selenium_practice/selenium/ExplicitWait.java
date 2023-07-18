package selenium_practice.selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) throws Exception {
	     WebDriverManager.chromedriver().setup();
	     ChromeDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();

	     driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	     //Im applying ExplicitWait to driver using WebDriverWait class.
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	     
	     driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	     wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='alert']"))));
		 driver.findElement(By.xpath("//button[@id='alert']")).click();
         wait.until(ExpectedConditions.alertIsPresent());
         driver.switchTo().alert().accept();   
         driver.findElement(By.xpath("//button[@id='populate-text']")).click();
        while(wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='h2']"), "Selenium Webdriver")))
        {
        if( driver.findElement(By.xpath("//h2[@id='h2']")).getText().equals("Selenium Webdriver")) {
        	System.out.println("text found");
        	break;
        }
//        	else {
//        		System.out.println("text not found");
//        	}
         }
        driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
        
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='hidden']"))));
        
        //driver.findElement(By.xpath("//button[@id='hidden']")).click();
        
        while(driver.findElement(By.xpath("//button[@id='hidden']")).isDisplayed())
        {
           driver.findElement(By.xpath("//button[@id='hidden']")).click();
           if(driver.findElement(By.xpath("//button[@id='hidden']")).isDisplayed()) 
           {
        	 System.out.println(true);  
           }
           else {
        	   System.out.println(false);
           }
           break;
        }
        
        driver.findElement(By.xpath("//button[@id='enable-button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='disable']"))));
       
        if(driver.findElement(By.xpath("//button[@id='disable']")).isEnabled()) {
           System.out.println("button Enabled");	
        }else
        {System.out.println("not enabled");}
        
      
       driver.findElement(By.xpath("//button[@id='checkbox']")).click();
      wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath("//input[@id='ch']"))));
       if(driver.findElement(By.xpath("//input[@id='ch']")).isSelected()) {
           System.out.println("checkbox checked");	
        }
        else
        {System.out.println("NOt checked");}
        
        Thread.sleep(4000);
        driver.close();
       
	}
}
