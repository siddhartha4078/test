/**
 * 
 */
package features;

import org.testng.annotations.Test;

/**
 * @author siddhartha
 * 
		<groups>


			<run>

				<include name=""></include>

			</run>

		</groups>
 *
 */
public class Grouping {

	@Test(groups = { "odd" })
	public void one() {

		System.out.println("one");
	}

	@Test(groups = { "even" })
	public void two() {
		System.out.println("two");
	}

	@Test(groups = { "odd" })
	public void three() {
		System.out.println("three");
	}

	@Test(groups = { "even" })
	public void four() {
		System.out.println("four");
	}

}
