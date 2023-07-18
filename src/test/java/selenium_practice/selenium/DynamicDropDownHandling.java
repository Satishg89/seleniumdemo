package selenium_practice.selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DynamicDropDownHandling {
	
//here we select drop down without select tag in html document
public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//multi-select/div[@id='msdd']")).click();
	    List<WebElement> lang = driver.findElements(By.xpath("//div/ul/li[@class='ng-scope']/a"));
	    for(int i=0;i<lang.size();i++) 
	    {
	    	if(lang.get(i).getText().equalsIgnoreCase("English")||(lang.get(i).getText().equalsIgnoreCase("Korean"))
	    			||lang.get(i).getText().equalsIgnoreCase("Hindi"))
	            lang.get(i).click();
	    }
	}
}
