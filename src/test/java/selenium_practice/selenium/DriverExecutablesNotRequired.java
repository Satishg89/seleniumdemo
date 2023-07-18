package selenium_practice.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverExecutablesNotRequired {
//In the Selenium current versions there is no need to use of External  jars like bonigarcia
//for driver Setup. directly we can create driver object.
	
	public static void main(String[] args) {		
		ChromeDriver  driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");	
	}

}
