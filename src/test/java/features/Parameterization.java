/**
 * 
 */
package features;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author siddhartha
 *
 *<suite name="Suite">
 *<parameter name="para1" value="parameter1"></parameter>
   <parameter name="para2" value="parameter2"></parameter>

 */
public class Parameterization {
	
    @Parameters({"para1","para2"})
	@Test
	public void parametervalue(String para1, String para2) {
		
		System.out.println(para1);
		
		System.out.println(para2);

	}

}
