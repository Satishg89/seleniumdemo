package selenium_practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidatingWebElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='firstName']"));  
		ele1.sendKeys("satish");
		if(ele1.isEnabled() ){
			System.out.println("Text box enabled");
		}  else
		{
		System.out.println("text box not enabled");	
		}
		
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='femalerb']"));
		//ele2.click();
		if(ele2.isSelected()) {
			System.out.println("radio buttton is clicked");
		}
		else {
			System.out.println("radio button not clicked");
		}
        
		WebElement ele3 = driver.findElement(By.xpath("(//label/b)[1]"));
		ele3.isDisplayed();
		if(ele3.getText().equals("First Name")) {
			System.out.println(ele3.isDisplayed());
		}else {System.out.println(false);}
		
		driver.close();
      }
}
