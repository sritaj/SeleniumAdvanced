package samplescripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleScript1 {
	
	@Test
	public void testSucc(){
	    Assert.assertTrue(true);
	}
	@Test
	public void testFail(){
	    Assert.assertTrue(false,"I am asserting false.");
	}
//	@Test(dependsOnMethods = "testFail")
//	public void testSkip(){
//	    Assert.assertTrue(true);
//	}


}
