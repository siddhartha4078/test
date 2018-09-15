/**
 * 
 */
package features;

import org.testng.annotations.Test;

/**
 * @author siddhartha
 * 
 * 
 * (priority=1)
 * (priority=2)
 * (priority=3)
 * 
 *
 */
public class Priority {
	
	
	@Test(priority=1)
	public void one() {

		System.out.println("priority-one");
	}

	@Test(priority=2)
	public void two() {
		System.out.println("priority-two");
	}

	@Test(priority=3)
	public void three() {
		System.out.println("priority-three");
	}

	@Test(priority=4)
	public void four() {
		System.out.println("priority-four");
	}

}
