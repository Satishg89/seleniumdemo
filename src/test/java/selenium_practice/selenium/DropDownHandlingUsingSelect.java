package selenium_practice.selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlingUsingSelect {
//Select class in java only works on select tags in html.

	public static void main(String[] args)
	{
	  	WebDriverManager.chromedriver().setup();
	  	ChromeDriver driver =  new ChromeDriver();
	  	driver.manage().window().maximize();
	  	driver.get("https://demo.automationtesting.in/Register.html");
	  	WebElement dropdown = driver.findElement(By.xpath("//select[@id='Skills']"));
	  	
	  	//we use select class for handling dropdown boxes
	  	Select sel = new Select(dropdown);
 
	  	sel.selectByValue("Java");
	  	sel.selectByIndex(7);
	  	sel.selectByVisibleText("XML");
	  	//isMultiple method checks the given dropdown box is multiselect or not(boolean).
	  	
	  	System.out.println(sel.isMultiple()); 
	  
	  	List<WebElement>  options =sel.getOptions();
	  	for(WebElement print:options) {
	  		if(print.getText().equalsIgnoreCase("AutoCAD"))
	  	     {sel.selectByValue(print.getText());}
	  	}
	  	//deselect does not support on single select dropdown.
	  	//sel.deselectByValue("AutoCAD"); 	
	}
}
