package testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataprovider {
	@DataProvider(name="login")
	public Object[][] login(){
		return new Object[][] {
		{"manager", "123"},
		{"Admin","456"}
		};
	}
	@Test(dataProvider="login")
	public void testlogin(String name,String password) {
		System.out.println("name is--" +name);
		
		System.out.println("password is--" +password);
	}

}
