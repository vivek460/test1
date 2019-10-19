package test;

import javax.xml.crypto.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LOginsee {
	@Test(dataProvider="ResgisterDatadataProvider",dataProviderClass=Data.class)
	public void f1(String firstname) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		WebElement reg=driver.findElement(By.linkText("SIGN-ON"));
		reg.click();
		WebElement fn=driver.findElement(By.name("userName"));
		fn.sendKeys("firstname");
		WebElement fn1=driver.findElement(By.name("password"));
		fn1.sendKeys("Vivpac@46");
		WebElement fn2=driver.findElement(By.name("login"));
		fn2.click();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
