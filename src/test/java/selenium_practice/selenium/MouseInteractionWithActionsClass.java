package selenium_practice.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseInteractionWithActionsClass{

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.automationtesting.in/Register.html");
	    Thread.sleep(3000);
    Actions mouse = new Actions(driver);
    mouse.moveToElement(driver.findElement(By.xpath("//select[@id='Skills']"))).click().build().perform();
    List<WebElement> skillslist = driver.findElements(By.xpath("//select[@id='Skills']/option"));
    for(int i=0;i<skillslist.size();i++) 
    {
       if(skillslist.get(i).getText().equalsIgnoreCase("java"))
     
       {
    	  skillslist.get(i).click();  
       }
    }
    mouse.click(driver.findElement(By.xpath("//input[@placeholder='First Name']"))).sendKeys("satish").build().perform();
    //mouse.clickAndHold().perform();
   mouse.doubleClick().perform();
   mouse.contextClick().perform();
   mouse.clickAndHold();
   mouse.keyDown(Keys.ENTER).perform();
   mouse.keyUp(null);
   mouse.dragAndDrop(null, null);
   mouse.release();
   // driver.close();
	}
}
