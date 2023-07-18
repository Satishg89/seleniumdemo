package testNGpractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class AnnotationTest {
	
  @Test
  public void test1() {
	 System.out.println("Hi This Annoatation demo Test"); 
  }
  @Test
  public void test2() {
	 System.out.println("Hi This Annoatation demo Test2"); 
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod annoated method executes before every test method present in current class ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod annoated method executes after every method present in cuurent class\n");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("@Beforeclass annotated method excutes before class\n");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@Afterclass annotated method excutes after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@Beforetest annotated method excutes before every test specified in xml page");
  }
    @AfterTest
  public void afterTest() {
	 
	  System.out.println("@Aftertest annotated method excutes After every test specified in xml page");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@BeforeSuit annoated method executes before every suite specified in xml page");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuit annoated method executes after every suite specified in xml page");
  
  }
}
