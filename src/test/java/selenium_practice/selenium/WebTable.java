package selenium_practice.selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
      //The All the rows in the webtable
		//findElements() method returns the list of WebElements
		List<WebElement> rows  = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		//Now by using foreach we iterate the list and we print rows data 
        for(WebElement ele:rows) 
        {System.out.println(ele.getText());}
        
        
      System.out.println(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr/th[3]")).getText());
      List<WebElement> pricecolumn = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/td[3]"));
      
      for(WebElement ele:pricecolumn) 
      {System.out.println(ele.getText());}
       
      Thread.sleep(5000);
     //driver.close() method will close the current window
      driver.close();
      //driver.quit() closes all windows open in a session. 
     //driver.quit();
      
	}  
}

