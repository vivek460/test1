package test;

import org.testng.annotations.DataProvider;

public class Datap {
	@DataProvider(name="ResgisterData")
	public Object [][] testdata(){
		return new Object [][] {
			{"paras"},
			{"vicky"},
			{"arjun"},
		};
	}

}
