/**
 * 
 */
package features;

import org.testng.annotations.Test;

/**
 * @author siddhartha
 *
 */
public class Invocationcount {
	
	@Test (invocationCount=100)
	public void invoke() {
		
		int count = 0;
		
		count= count + 1;
		
		System.out.println(count);
		
	}

}
