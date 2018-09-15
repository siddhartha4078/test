/**
 * 
 */
package parallal_execution;

import org.testng.annotations.Test;

/**
 * @author siddhartha
 * <suite name="Suite" parallel="methods">
 *
 */
public class method_parallal {

	@Test
	public void one() {

		System.out.println("priority-one");
	}

	@Test
	public void two() {
		System.out.println("priority-two");
	}

	@Test
	public void three() {
		System.out.println("priority-three");
	}

	@Test
	public void four() {
		System.out.println("priority-four");
	}

}
