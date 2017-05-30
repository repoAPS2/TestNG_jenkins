package core;

import org.testng.annotations.Test;

public class AppTest {
	
	
  @Test(enabled =true)
  public void test() {
	  
	  org.testng.Assert.assertEquals("abc", "abc", "Error message ");
	  
  }
  
  @Test(enabled =true)
  public void test2() {
	  
	  org.testng.Assert.assertEquals("klm", "abc", "Error message ");
  }
}
