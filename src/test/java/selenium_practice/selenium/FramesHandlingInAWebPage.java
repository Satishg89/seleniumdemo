package selenium_practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandlingInAWebPage {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.findElement(By.xpath("//input[@class='frmTextBox']")).sendKeys("Satish");
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm1']")));
		Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"selectnav1\"]")).click();
        Thread.sleep(3000);
		/*
		 * When Ever we switch to a frame to get back to another frame we
		 * defaultcontent() which means main webocument // and later we switch to
		 * another switch
		 */ 
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm2']")));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("satishgudala");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='frmTextBox']")).sendKeys("Gudala");
		Thread.sleep(3000);
		driver.quit();
	
	}
}
