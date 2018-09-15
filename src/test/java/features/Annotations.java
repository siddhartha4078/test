/**
 * 
 */
package features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author siddhartha
 * 
 * Suite
 * Test
 * Class
 * Method
 * 
 * 
 *
 */
public class Annotations {

	@BeforeSuite
	public void bsuite() {
		System.out.println("Before suite");

	}
   
	@AfterSuite
	public void asuite() {
		System.out.println("After Suite");

	}
    
	
	@BeforeTest
	public void btest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void atest() {
		System.out.println("After Test");
	}

	@BeforeClass
	public void bclass() {
		System.out.println("Befoe Class");
	}

	@AfterClass
	public void aclass() {
		System.out.println("After Class");
	}

	@BeforeMethod
	public void bmethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void amethod() {
		System.out.println("After Method");
	}

	@Test
	public void actualtest1() {
		System.out.println("Actual test case");
	}

	@Test
	public void actualtest2() {
		System.out.println("Actual test case");
	}
}
