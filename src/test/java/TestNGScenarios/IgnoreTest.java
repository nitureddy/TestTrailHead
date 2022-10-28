package TestNGScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IgnoreTest {
   String message = "Manisha";

   @Test(enabled = false)
   public void testPrintMessage() {
      System.out.println("Inside testPrintMessage()");
     
   }

   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");

   }
}
