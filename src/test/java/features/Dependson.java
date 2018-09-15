
package features;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * @author siddhartha
 * 
 * @Test(dependsOnMethods = "one")
 * 
 * @Test(dependsOnGroups = { "non dependent" })
 *
 */
public class Dependson {

	@Test(groups = { "non dependent" })
	public void one() {
		
		

		System.out.println("non dependent");
	}

	@Test(dependsOnMethods = "four", groups = { "dependent" })
	public void two() {
		System.out.println("depends on four");
	}

	@Test(dependsOnMethods = "one", groups = { "dependent" })
	public void three() {
		System.out.println("depends on one ");
	}

	@Test(dependsOnGroups = { "non dependent" })
	public void four() {
		assertEquals(false, true);
		System.out.println("final method");
	}

}
