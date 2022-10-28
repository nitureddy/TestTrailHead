package TestNGScenarios;

/*<test thread-count="5" name="Test">
<parameter name = "myName" value="Sunitha"/>
<classes>
   <class name = "ParameterizedTest1" />
</classes>*/

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1 {
	   @Test
	   @Parameters("myName")
	   public void parameterTest(String myName) {
	      System.out.println("Parameterized value is : " + myName);
	   }
	}


