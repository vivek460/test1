package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement fn=driver.findElement(By.id("email"));
		fn.sendKeys("vivekpachange1@gmail.com");
		WebElement fn1=driver.findElement(By.id("pass"));
		fn1.sendKeys("VIVPAC@46");
		WebElement fn2=driver.findElement(By.id("Log In"));
		fn2.click();
		
	}

}
