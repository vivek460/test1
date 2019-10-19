package testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DATAPROVIDERINSAMECLASS 
{
	
	@Test(dataProvider="tp data")
	
	public void testmethod(String param) {
		System.out.println(param);
	
	
	}
	@DataProvider(name="tp data")
	public Object [][] dataProviderMethod()
	{
		return new Object[][]
				{
			{"first set of Data"},
			{"second set of Data"}
	
				};
	}
}
