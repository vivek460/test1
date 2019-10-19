package testcase;

import java.security.PublicKey;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestA {
	@Test
	public void doLogin() {
		System.out.println("DO login Test");
		//Assert.assertTrue(5>1);
		//Assert.assertTrue(1>5);
	}
	@Test
	public void dopasswordchange() {
		System.out.println("DO PASSWORD CHANGE");
	}
	@Test
	public void doLogout() {
		System.out.println("DO Logout");
	}
}
