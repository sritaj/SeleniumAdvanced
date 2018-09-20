package samplescripts;

import org.testng.Assert;
import org.testng.annotations.Test;

	
	public class SampleScript2 {
		
		  
		@Test
		public void testTrue(){
		    Assert.assertTrue(true);
		}
		@Test
		public void testFalse(){
		    Assert.assertTrue(false,"I am asserting false.");
		}
//		@Test(dependsOnMethods = "testFalse")
//		public void testSkip(){
//		    Assert.assertTrue(true);
//		}
	 
	}


