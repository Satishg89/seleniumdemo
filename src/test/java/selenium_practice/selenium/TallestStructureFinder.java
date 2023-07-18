package selenium_practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class TallestStructureFinder {

    public static void main(String[] args) {
        // Set the path to the chromedriver executable
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    	WebDriverManager.chromedriver().setup();
       
    	// Launch the Chrome browser and navigate to the webpage
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        // Find the second table on the page
        WebElement table = driver.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table"));

        // Find all rows in the table
        List<WebElement> rows = table.findElements(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tbody/tr"));
       System.out.println(rows.size());
        // Initialize variables to hold the maximum height and structure name
        double maxHeight = 0;
        String maxName = "";
      
        // Loop through each row in the table, skipping the header row
        for (int i = 0; i < rows.size(); i++) {
            // Find all columns in the current row
        	List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
            // Get the height value from the second column
            double height = Double.parseDouble(columns.get(2).getText().replace("m", ""));

             //If the current height is greater than the current maximum height, update the maximum
            if (height > maxHeight) {
                maxHeight = height;
                maxName = rows.get(i).findElement(By.tagName("th")).getText();
            }
        }

        // Print the name and height of the tallest structure
        System.out.println("The tallest structure is " + maxName + " with a height of " + maxHeight + "m");

        // Close the browser
        driver.quit();
    }
}