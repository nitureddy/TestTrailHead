package TestNGScenarios;

import org.testng.annotations.Test;


public class DependencyTestUsingAnnotation {

	   @Test(groups = { "init" })
	   public void testPrintMessage() {
	      System.out.println("Inside testPrintMessage()");
	     }

	   @Test(dependsOnGroups = { "init.*" })
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");

	   }

	   @Test(groups = { "init" })
	   public void initEnvironmentTest() {
	      System.out.println("This is initEnvironmentTest");
	   }
	}
