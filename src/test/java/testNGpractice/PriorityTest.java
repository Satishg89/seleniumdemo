package testNGpractice;

import org.testng.annotations.Test;

public class  PriorityTest {
	
	/*
	 * If we are not prioritizing tests.Test will run randomly based on ASCII value.
	   as per the name of test method
	 */
	
	/*
        So we can give Priority which test to run based on priority  
        By using @priority attribute (Exp:  priority = integer value)	
       For  Ex : @Test(priority = 1)
       priority accepts integer as value so we can negative int or positive int value
       It starts from lowest value  
       But giving negative value is not recommended
	 */
	
  @Test(priority = 1)
  public void testOne() {
	  System.out.println("This is test1");
  }
  
  @Test(priority = 2)
  public void testTwo() {
	  System.out.println("This is test2");
  }
  
  @Test(priority = 3)
  public void testThree() {
	  System.out.println("This is test3");
  }
	/*
	 * if we are not set any priority first non priority tests executes first based
	 * on ascii value then prioritised test will run
	 */
  @Test
  public void testsix() {
	  System.out.println("This is non priority test");
  }
}
