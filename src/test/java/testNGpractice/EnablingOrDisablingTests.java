package testNGpractice;

import org.testng.annotations.Test;

public class EnablingOrDisablingTests {
	/*We Use @Test(enabled = true) 
	 * (enabled = boolean value) either true or false
	   Attribute: (enabled)
	 */
	/* Here in below code Im using (enabled = true) 
	 * so This test is enabled it will execute
	 */
@Test(enabled = true)
public void enableTest1() {	
	System.out.println("This test1 is enabled");
}

@Test(enabled = true)
public void enableTest2() {	
	System.out.println("This test2 is enabled");
}

/* Here in below code im using (enabled = false) 
 * so This test is disabled it will not execute
 */
@Test(enabled = false)
public void enableTest3() {	
	System.out.println("This test3 is disabled");
}
}
