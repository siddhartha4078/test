/**
 * 
 */
package features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author siddhartha
 *
 */
public class Dataprovider {

	@DataProvider(name = "testdata")
	public Object[][] provider() {

		Object[][] data = new Object[3][2];

		data[0][0] = "user1";
		data[0][1] = "pass1";

		data[1][0] = "user2";
		data[1][1] = "pass2";

		data[2][0] = "user3";
		data[2][1] = "pass3";

		return data;
	}
	
	
	
	@Test (dataProvider = "testdata")
	public void login(String username,String Password) {
		
		
		System.out.println(username);
		System.out.println(Password);
		
	}

}
