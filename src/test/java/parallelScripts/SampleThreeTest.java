package parallelScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {
	@Test
	  public void testOne() {
		 long id = Thread.currentThread().getId();
		  System.out.println("TestOne from Sample3  "+id);
	  }
	  @Test
	  public void testTwo() {
		  long id = Thread.currentThread().getId();
		  System.out.println("TestTwo from Sample3  "+ id);
	  }
	  @Test
	  public void testThree() {
		  long id = Thread.currentThread().getId();
		  System.out.println("TestThree from Sample3  " + id);
	  }
	  @Test
	  public void testFour() {
		  long id = Thread.currentThread().getId();
		  System.out.println("TestFour from Sample3  "+id);
	  }

}
