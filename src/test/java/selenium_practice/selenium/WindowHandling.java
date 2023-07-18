package selenium_practice.selenium;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
	   WebDriverManager.chromedriver().setup();
	   ChromeDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
       driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
       String parentwindow = driver.getWindowHandle();
       
       driver.findElement(By.xpath("//input[@id='name']")).sendKeys("satish");
       driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
       driver.findElement(By.xpath("//button[@id='newTabsWindowsBtn']")).click();
       driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
      
         Set<String> handles = driver.getWindowHandles();
         Iterator<String> ite= handles.iterator();
          System.out.println(handles.size());
         while(ite.hasNext())
         {
           String windowtitle= ite.next();
          if(driver.switchTo().window(windowtitle).getTitle().equalsIgnoreCase("Basic Controls - H Y R Tutorials"))
          {
        	  driver.switchTo().window(windowtitle).manage().window().maximize();
        	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("satish");
        	  Thread.sleep(3000);
        	  driver.close();
        	  handles= driver.getWindowHandles();
        	  System.out.println(handles.size());
        	  ite=handles.iterator();
        	  break;
           }
          }
          while(ite.hasNext())
          {
           String windowtitle= ite.next();
           if(driver.switchTo().window(windowtitle).getTitle().equalsIgnoreCase("Basic Controls - H Y R Tutorials"))
           {
         	  driver.switchTo().window(windowtitle).manage().window().maximize();
         	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("satish");
         	  Thread.sleep(3000);
         	  driver.close();
         	  handles= driver.getWindowHandles();
         	  System.out.println(handles.size());
         	  ite=handles.iterator();
         	  break;
           }
         }
          Thread.sleep(5000);
          driver.switchTo().window(parentwindow);
          driver.findElement(By.xpath("//input[@id='name']")).sendKeys("gudala");
          Thread.sleep(5000);
          driver.quit();
       }
}