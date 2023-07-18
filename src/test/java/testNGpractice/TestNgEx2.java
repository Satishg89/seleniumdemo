package testNGpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgEx2    
{	 	
	//Here In this class we run two test cases parallely using TestNg 
	//here we run google test.
	@Test
	public void googletest() throws Exception {
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("hello google",Keys.ENTER);
		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	//Here TestNg will run First Facebook method and then google because it will go in 
	//alphabatecial order If we didnot set any priorities.
	@Test
	public void facebook() throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Satish@gmail",Keys.ENTER);
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
